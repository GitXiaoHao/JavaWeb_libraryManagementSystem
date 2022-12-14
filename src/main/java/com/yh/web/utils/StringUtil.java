package com.yh.web.utils;

/**
 * 作者 小豪<p>
 * 时间 2022/12/14<p>
 *
 * @author yu<p>
 */
public class StringUtil {
    public static boolean ifNull(String str) {
        if (str != null && !"".equals(str)) {
            return true;
        }
        return false;
    }
}
