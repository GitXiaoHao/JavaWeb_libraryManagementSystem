package com.yh.web.service;

import com.yh.web.pojo.BookAll;
import com.yh.web.pojo.BookType;
import com.yh.web.utils.PageBean;

import java.util.List;

/**
 * 作者 小豪<p>
 * 时间 2022/12/14<p>
 *
 * @author yu<p>
 */
public interface BookAllService {
    /**
     * 增加图书
     * @param bookAll 图书
     * @return 添加成功返回true
     */
    boolean insertNewBook(BookAll bookAll);

    /**
     * 查找所有图书
     * @return 返回图书集合
     */
    List<BookAll> selectAllBooks();

    /**
     * 删除图书
     * @param bookAll 图书
     * @return 删除成功返回true
     */
    boolean deleteBook(BookAll bookAll);

    /**
     * 分页模糊查询
     * @param bookAll 模糊查询的对象
     * @param currentPage 当前页
     * @param limit 每页显示的条数
     * @return 查询之后的集合
     */
    PageBean<BookAll> fuzzyQuery(int currentPage, int limit,BookAll bookAll);



    /**
     * 批量删除
     * @param list 要删除的集合
     * @return 删除成功返回true
     */
    boolean batchDeleteBook(List<BookAll> list);

    /**
     * 修改图书
     * @param bookAll 修改图书
     * @return 修改成功返回true
     */
    boolean updateBook(BookAll bookAll);

    /**
     * 分页查询
     * @param currentPage 当前页码
     * @param limit 每页的条数
     * @return 该页的集合
     */
    PageBean<BookAll> selectByPage(int currentPage,int limit);
}
