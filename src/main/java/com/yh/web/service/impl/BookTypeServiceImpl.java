package com.yh.web.service.impl;

import com.yh.web.mapper.BookTypeMapper;
import com.yh.web.pojo.BookType;
import com.yh.web.service.BookTypeService;
import com.yh.web.utils.MyBatisUtil;

import java.util.List;

/**
 * 作者 小豪<p>
 * 时间 2022/12/14<p>
 *
 * @author yu<p>
 */
public class BookTypeServiceImpl implements BookTypeService {
    private final BookTypeMapper mapper = MyBatisUtil.SESSION.getMapper(BookTypeMapper.class);
    @Override
    public List<BookType> selectAllBookTypes() {
        return mapper.selectByExample(null);
    }
}
