package com.yh.web.mapper;

import com.yh.web.pojo.UserOrdinary;
import com.yh.web.pojo.UserOrdinaryExample;
import com.yh.web.pojo.UserOrdinaryKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserOrdinaryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_ordinary
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    long countByExample(UserOrdinaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_ordinary
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    int deleteByExample(UserOrdinaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_ordinary
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    int deleteByPrimaryKey(UserOrdinaryKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_ordinary
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    int insert(UserOrdinary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_ordinary
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    int insertSelective(UserOrdinary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_ordinary
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    List<UserOrdinary> selectByExample(UserOrdinaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_ordinary
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    UserOrdinary selectByPrimaryKey(UserOrdinaryKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_ordinary
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    int updateByExampleSelective(@Param("record") UserOrdinary record, @Param("example") UserOrdinaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_ordinary
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    int updateByExample(@Param("record") UserOrdinary record, @Param("example") UserOrdinaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_ordinary
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    int updateByPrimaryKeySelective(UserOrdinary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_ordinary
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    int updateByPrimaryKey(UserOrdinary record);
}