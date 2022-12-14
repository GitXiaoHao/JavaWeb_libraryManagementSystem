package com.yh.web.service;

import com.yh.web.pojo.BookType;

import java.util.List;

/**
 * 作者 小豪<p>
 * 时间 2022/12/14<p>
 *
 * @author yu<p>
 */
public interface BookTypeService {
    /**
     * 查找图书的所有类型
     *
     * @return 类型集合
     */
    List<BookType> selectAllBookTypes();
}
