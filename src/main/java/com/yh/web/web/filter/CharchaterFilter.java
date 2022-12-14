package com.yh.web.web.filter;


import com.yh.web.utils.MyBatisUtil;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 作者 小豪<p>
 * 时间 2022/12/6<p>
 *
 * @author yu<p>
 */
@WebFilter(value = "/*", dispatcherTypes = DispatcherType.REQUEST)
public class CharchaterFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
        MyBatisUtil.closeSession();
//        RedisUtil.closeJedis();
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException
                                                                                                             ,
                                                                                                     IOException {
        //将父接口转为子接口
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        //获取请求方法
        String method = httpServletRequest.getMethod();
        //解决中文乱码问题
        if ("post".equalsIgnoreCase(method)) {
            httpServletRequest.setCharacterEncoding("utf-8");
        }
        //处理响应乱码

        chain.doFilter(httpServletRequest, httpServletResponse);
    }
}
