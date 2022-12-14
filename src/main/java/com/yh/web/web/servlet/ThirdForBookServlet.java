package com.yh.web.web.servlet;


import com.alibaba.fastjson.JSONObject;
import com.yh.web.pojo.BookAll;
import com.yh.web.pojo.BookType;
import com.yh.web.service.BookAllService;
import com.yh.web.service.BookTypeService;
import com.yh.web.service.impl.BookAllServiceImpl;
import com.yh.web.service.impl.BookTypeServiceImpl;
import com.yh.web.utils.JsonUtil;
import com.yh.web.utils.PageBean;
import com.yh.web.utils.ResultInfo;
import com.yh.web.utils.StringUtil;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 作者 小豪<p>
 * 时间 2022/12/14<p>
 *
 * @author yu<p>
 */
@WebServlet("/third/bookServlet/*")
public class ThirdForBookServlet extends BaseServlet {
    private final BookAllService bookAllService = new BookAllServiceImpl();
    private final BookTypeService typeService = new BookTypeServiceImpl();
    private final ResultInfo resultInfo = new ResultInfo();
    /**
     * 查找所有图书
     */
    public void selectAllBooks(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<BookAll> bookAlls = bookAllService.selectAllBooks();
        this.writeValue(response, bookAlls);
    }

    public void selectByPage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String formInline = request.getParameter("formInline");
        if (StringUtil.ifNull(formInline)) {
            this.fuzzyQuery(request,response);
            return;
        }
        String currentPageStr = request.getParameter("currentPage");
        String limitStr = request.getParameter("limit");
        int currentPage = 0;
        int limit = 5;
        if (StringUtil.ifNull(currentPageStr)) {
            currentPage = Integer.parseInt(currentPageStr);
        }else {
            currentPage = 1;
        }
        if (StringUtil.ifNull(limitStr)) {
            limit = Integer.parseInt(limitStr);
        }
        PageBean<BookAll> bookAllPageBean = bookAllService.selectByPage(currentPage, limit);
        this.writeValue(response, bookAllPageBean);
    }
    /**
     * 查找所有图书类型
     */
    public void selectAllBookTypes(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<BookType> bookTypes = typeService.selectAllBookTypes();
        this.writeValue(response,bookTypes);
    }

    /**
     * 模糊查询
     */
    public void fuzzyQuery(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String formInline = request.getParameter("formInline");
        String currentPageStr = request.getParameter("currentPage");
        String limitStr = request.getParameter("limit");
        int currentPage = 1;
        int limit = 5;
        if (StringUtil.ifNull(currentPageStr)) {
            currentPage = Integer.parseInt(currentPageStr);
        }
        if (StringUtil.ifNull(limitStr)) {
            limit = Integer.parseInt(limitStr);
        }
        BookAll bookAll = JSONObject.parseObject(formInline, BookAll.class);
        PageBean<BookAll> pageBean = bookAllService.fuzzyQuery(currentPage,limit,bookAll);
        this.writeValue(response,pageBean);
    }

    public void insertNewBook(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String ruleForm = request.getParameter("ruleForm");
        BookAll bookAll = JSONObject.parseObject(ruleForm, BookAll.class);
        bookAll.setBookStatus("闲置");
        boolean flag = bookAllService.insertNewBook(bookAll);
        resultInfo.setFlag(flag);
        if (!flag) {
            resultInfo.setErrorMsg("添加失败");
        }
        this.writeValue(response, resultInfo);
    }
    public void updateBook(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String currentRow = request.getParameter("currentRow");
        BookAll bookAll = JSONObject.parseObject(currentRow, BookAll.class);
        boolean flag = bookAllService.updateBook(bookAll);
        resultInfo.setFlag(flag);
        if (!flag) {
            resultInfo.setErrorMsg("修改失败");
        }
        this.writeValue(response,resultInfo);
    }

    public void deleteBook(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String currentRow = request.getParameter("currentRow");
        BookAll bookAll = JSONObject.parseObject(currentRow, BookAll.class);
        boolean flag = bookAllService.deleteBook(bookAll);
        resultInfo.setFlag(flag);
        if (!flag) {
            resultInfo.setErrorMsg("删除失败");
        }
        this.writeValue(response, resultInfo);
    }
    public void batchDeleteBook(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String multipleSelection = request.getParameter("multipleSelection");
        List<BookAll> list = JSONObject.parseArray(multipleSelection, BookAll.class);
        boolean flag = bookAllService.batchDeleteBook(list);
        resultInfo.setFlag(flag);
        if (!flag) {
            resultInfo.setErrorMsg("删除失败");
        }
        this.writeValue(response, resultInfo);
    }
}
