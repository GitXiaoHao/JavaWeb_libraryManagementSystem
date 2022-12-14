package com.yh.web.utils;

import java.io.IOException;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 作者 小豪<p>
 * 时间 2022/12/14<p>
 *
 * @author yu<p>
 */
public class JsonUtil {
    public static String getJson(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // 获取JSON数据
        ServletInputStream is = req.getInputStream();
        byte[] buffer = new byte[1024];
        StringBuilder sb = new StringBuilder();
        while (is.read(buffer) != -1) {
            // tomcat按默认的编码： iso-8859-1对其进行解码
            // 所以在这里需要手动地指明用utf-8来解码
            sb.append(new String(buffer, "utf-8"));
        }
        String json = sb.toString().trim();
        System.out.println(json);
        // 调试用
        return json;
    }

}
