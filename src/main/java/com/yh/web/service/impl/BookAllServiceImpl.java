package com.yh.web.service.impl;

import com.yh.web.mapper.BookAllMapper;
import com.yh.web.pojo.BookAll;
import com.yh.web.pojo.BookAllExample;
import com.yh.web.service.BookAllService;
import com.yh.web.utils.MyBatisUtil;
import com.yh.web.utils.PageBean;
import com.yh.web.utils.StringUtil;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * 作者 小豪<p>
 * 时间 2022/12/14<p>
 *
 * @author yu<p>
 */
public class BookAllServiceImpl implements BookAllService {
    private final BookAllMapper mapper = MyBatisUtil.SESSION.getMapper(BookAllMapper.class);

    @Override
    public boolean insertNewBook(BookAll bookAll) {
        if (mapper.insert(bookAll) == 1) {
            MyBatisUtil.submitSession();
            return true;
        }
        MyBatisUtil.rollBack();
        return false;
    }

    @Override
    public List<BookAll> selectAllBooks() {
        List<BookAll> list = mapper.selectByExample(null);
        MyBatisUtil.closeSession();
        return list;
    }

    public static void main(String[] args) {
        BookAllServiceImpl bookAllService = new BookAllServiceImpl();
        List<BookAll> list = bookAllService.selectAllBooks();
        System.out.println(list);
    }
    @Override
    public boolean deleteBook(BookAll bookAll) {
        if (mapper.deleteByPrimaryKey(bookAll) == 1) {
            MyBatisUtil.submitSession();
            return true;
        }
        MyBatisUtil.rollBack();
        return false;
    }

    @Override
    public PageBean<BookAll> fuzzyQuery(int currentPage, int limit,BookAll bookAll) {
        BookAllExample bookAllExample = new BookAllExample();
        BookAllExample.Criteria criteria = bookAllExample.createCriteria();
        if (StringUtil.ifNull(bookAll.getBookAuthor())) {
            criteria.andBookAuthorLike("%" + bookAll.getBookAuthor() + "%");
        }
        if (StringUtil.ifNull(bookAll.getBookName())) {
            criteria.andBookAuthorLike("%" + bookAll.getBookName() + "%");
        }
        if (StringUtil.ifNull(bookAll.getBookStatus())) {
            criteria.andBookAuthorLike("%" + bookAll.getBookStatus() + "%");
        }
        if (StringUtil.ifNull(bookAll.getBookIsbn())) {
            criteria.andBookAuthorLike("%" + bookAll.getBookIsbn() + "%");
        }
        if (StringUtil.ifNull(bookAll.getBookType())) {
            criteria.andBookAuthorLike("%" + bookAll.getBookType() + "%");
        }
        //开始索引
        int offset = (currentPage - 1) * limit;
        bookAllExample.setOffset(offset);
        bookAllExample.setLimit(limit);
        List<BookAll> list = mapper.selectByExample(bookAllExample);
        PageBean<BookAll> bookAllPageBean = new PageBean<>();
        bookAllPageBean.setList(list);
        //总记录数
        long count = mapper.countByExample(null);
        bookAllPageBean.setList(list);
        bookAllPageBean.setTotalCount(Math.toIntExact(count));
        bookAllPageBean.setRows(limit);
        return bookAllPageBean;
    }

    @Override
    public boolean batchDeleteBook(List<BookAll> list) {
        if (list != null) {
            List<Integer> integerList = new ArrayList<>(list.size());
            list.forEach((l) -> integerList.add(l.getBookId()));
            BookAllExample bookAllExample = new BookAllExample();
            BookAllExample.Criteria criteria = bookAllExample.createCriteria();
            criteria.andBookIdIn(integerList);
            int i = mapper.deleteByExample(bookAllExample);
            if (i == list.size()) {
                MyBatisUtil.submitSession();
                return true;
            } else {
                MyBatisUtil.rollBack();
            }
        }
        return false;
    }

    @Override
    public boolean updateBook(BookAll bookAll) {
        BookAllExample bookAllExample = new BookAllExample();
        BookAllExample.Criteria criteria = bookAllExample.createCriteria();
        criteria.andBookNameEqualTo(bookAll.getBookName());
        if(mapper.updateByExample(bookAll, bookAllExample) == 1){
            MyBatisUtil.submitSession();
            return true;
        }else{
            MyBatisUtil.rollBack();
        }
        return false;
    }

    @Override
    public PageBean<BookAll> selectByPage(int currentPage, int limit) {
        //开始索引
        int offset = (currentPage - 1) * limit;
//        查询当前页数据
        BookAllExample bookAllExample = new BookAllExample();
        bookAllExample.setOffset(offset);
        bookAllExample.setLimit(limit);
        List<BookAll> list = mapper.selectByExample(bookAllExample);
        //总记录数
        long count = mapper.countByExample(null);
        PageBean<BookAll> bookAllPageBean = new PageBean<>();
        bookAllPageBean.setCurrentPage(currentPage);
        bookAllPageBean.setList(list);
        bookAllPageBean.setTotalCount(Math.toIntExact(count));
        bookAllPageBean.setRows(limit);
        return bookAllPageBean;
    }
}
