package com.yh.web.web.servlet;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 作者 小豪<p>
 * 时间 2022/12/14<p>
 *
 * @author yu<p>
 */
public class BaseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //完成方法分发
        //获取请求参数
        String uri = req.getRequestURI();
        //获取方法名称
        String methodName = uri.substring(uri.lastIndexOf('/') + 1);
        //获取方法对象
        //获取字节码文件 获取方法名称
        try {
            Method method = this.getClass().getMethod(methodName, HttpServletRequest.class,
                    HttpServletResponse.class);
            method.invoke(this, req, resp);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * 直接传入对象序列化为json 并写回客户端
     */
    public void writeValue(HttpServletResponse response, Object object) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        //设置json格式
        response.setContentType("application/json;charset=utf-8");
        mapper.writeValue(response.getOutputStream(),object);
    }

    /**
     * 将传入的对象序列为json返回
     */
    public String writeValueAsString(Object object) throws JsonProcessingException {
        //序列化为Json
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(object);
    }
}
