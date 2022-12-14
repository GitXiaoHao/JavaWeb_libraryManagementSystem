package com.yh.web.mapper;

import com.yh.web.pojo.UserAdmin;
import com.yh.web.pojo.UserAdminExample;
import com.yh.web.pojo.UserAdminKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_admin
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    long countByExample(UserAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_admin
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    int deleteByExample(UserAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_admin
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    int deleteByPrimaryKey(UserAdminKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_admin
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    int insert(UserAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_admin
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    int insertSelective(UserAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_admin
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    List<UserAdmin> selectByExample(UserAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_admin
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    UserAdmin selectByPrimaryKey(UserAdminKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_admin
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    int updateByExampleSelective(@Param("record") UserAdmin record, @Param("example") UserAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_admin
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    int updateByExample(@Param("record") UserAdmin record, @Param("example") UserAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_admin
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    int updateByPrimaryKeySelective(UserAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_admin
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    int updateByPrimaryKey(UserAdmin record);
}