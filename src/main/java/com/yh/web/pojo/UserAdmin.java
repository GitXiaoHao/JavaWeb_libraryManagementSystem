package com.yh.web.pojo;

import java.util.Date;

public class UserAdmin extends UserAdminKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_admin.admin_username
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    private String adminUsername;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_admin.admin_password
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    private String adminPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_admin.admin_real_name
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    private String adminRealName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_admin.admin_birthday
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    private Date adminBirthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_admin.admin_sex
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    private String adminSex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_admin.admin_telephone
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    private String adminTelephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_admin.admin_email
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    private String adminEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_admin.admin_status
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    private String adminStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_admin.admin_code
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    private String adminCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_admin.admin_username
     *
     * @return the value of t_user_admin.admin_username
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public String getAdminUsername() {
        return adminUsername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_admin.admin_username
     *
     * @param adminUsername the value for t_user_admin.admin_username
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername == null ? null : adminUsername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_admin.admin_password
     *
     * @return the value of t_user_admin.admin_password
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_admin.admin_password
     *
     * @param adminPassword the value for t_user_admin.admin_password
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_admin.admin_real_name
     *
     * @return the value of t_user_admin.admin_real_name
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public String getAdminRealName() {
        return adminRealName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_admin.admin_real_name
     *
     * @param adminRealName the value for t_user_admin.admin_real_name
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public void setAdminRealName(String adminRealName) {
        this.adminRealName = adminRealName == null ? null : adminRealName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_admin.admin_birthday
     *
     * @return the value of t_user_admin.admin_birthday
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public Date getAdminBirthday() {
        return adminBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_admin.admin_birthday
     *
     * @param adminBirthday the value for t_user_admin.admin_birthday
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public void setAdminBirthday(Date adminBirthday) {
        this.adminBirthday = adminBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_admin.admin_sex
     *
     * @return the value of t_user_admin.admin_sex
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public String getAdminSex() {
        return adminSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_admin.admin_sex
     *
     * @param adminSex the value for t_user_admin.admin_sex
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public void setAdminSex(String adminSex) {
        this.adminSex = adminSex == null ? null : adminSex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_admin.admin_telephone
     *
     * @return the value of t_user_admin.admin_telephone
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public String getAdminTelephone() {
        return adminTelephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_admin.admin_telephone
     *
     * @param adminTelephone the value for t_user_admin.admin_telephone
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public void setAdminTelephone(String adminTelephone) {
        this.adminTelephone = adminTelephone == null ? null : adminTelephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_admin.admin_email
     *
     * @return the value of t_user_admin.admin_email
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public String getAdminEmail() {
        return adminEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_admin.admin_email
     *
     * @param adminEmail the value for t_user_admin.admin_email
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail == null ? null : adminEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_admin.admin_status
     *
     * @return the value of t_user_admin.admin_status
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public String getAdminStatus() {
        return adminStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_admin.admin_status
     *
     * @param adminStatus the value for t_user_admin.admin_status
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public void setAdminStatus(String adminStatus) {
        this.adminStatus = adminStatus == null ? null : adminStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_admin.admin_code
     *
     * @return the value of t_user_admin.admin_code
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public String getAdminCode() {
        return adminCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_admin.admin_code
     *
     * @param adminCode the value for t_user_admin.admin_code
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode == null ? null : adminCode.trim();
    }
}