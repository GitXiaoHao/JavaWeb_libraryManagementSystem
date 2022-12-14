package com.yh.web.utils;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("all")

/**
 * 作者 小豪<p>
 * 时间 2022/12/3<p>
 *
 * @author yu<p>
 * 分页工具对象
 */
public class PageBean<T> implements Serializable {
    /**
     * 总记录数
     */
    private int totalCount;
    /**
     * 总页码
     */
    private int totalPage;
    /**
     * 每页的数据
     */
    private List<T> list;
    /**
     * 当前页码
     */
    private int currentPage;
    /**
     * 每页显示的记录数
     */
    private int rows;
    /**
     * 模糊查询时的数据
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
}
