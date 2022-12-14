package com.yh.web.mapper;

import com.yh.web.pojo.BookRule;
import com.yh.web.pojo.BookRuleExample;
import com.yh.web.pojo.BookRuleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookRuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_rule
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    long countByExample(BookRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_rule
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    int deleteByExample(BookRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_rule
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    int deleteByPrimaryKey(BookRuleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_rule
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    int insert(BookRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_rule
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    int insertSelective(BookRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_rule
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    List<BookRule> selectByExample(BookRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_rule
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    BookRule selectByPrimaryKey(BookRuleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_rule
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    int updateByExampleSelective(@Param("record") BookRule record, @Param("example") BookRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_rule
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    int updateByExample(@Param("record") BookRule record, @Param("example") BookRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_rule
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    int updateByPrimaryKeySelective(BookRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_rule
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    int updateByPrimaryKey(BookRule record);
}