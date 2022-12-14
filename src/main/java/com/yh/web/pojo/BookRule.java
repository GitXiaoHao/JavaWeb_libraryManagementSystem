package com.yh.web.pojo;

public class BookRule extends BookRuleKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_book_rule.role_borrow_day
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    private Short roleBorrowDay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_book_rule.role_borrow_frequency
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    private Short roleBorrowFrequency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_book_rule.role_borrow_overtime
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    private Double roleBorrowOvertime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_book_rule.role_borrow_day
     *
     * @return the value of t_book_rule.role_borrow_day
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public Short getRoleBorrowDay() {
        return roleBorrowDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_book_rule.role_borrow_day
     *
     * @param roleBorrowDay the value for t_book_rule.role_borrow_day
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public void setRoleBorrowDay(Short roleBorrowDay) {
        this.roleBorrowDay = roleBorrowDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_book_rule.role_borrow_frequency
     *
     * @return the value of t_book_rule.role_borrow_frequency
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public Short getRoleBorrowFrequency() {
        return roleBorrowFrequency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_book_rule.role_borrow_frequency
     *
     * @param roleBorrowFrequency the value for t_book_rule.role_borrow_frequency
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public void setRoleBorrowFrequency(Short roleBorrowFrequency) {
        this.roleBorrowFrequency = roleBorrowFrequency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_book_rule.role_borrow_overtime
     *
     * @return the value of t_book_rule.role_borrow_overtime
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public Double getRoleBorrowOvertime() {
        return roleBorrowOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_book_rule.role_borrow_overtime
     *
     * @param roleBorrowOvertime the value for t_book_rule.role_borrow_overtime
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public void setRoleBorrowOvertime(Double roleBorrowOvertime) {
        this.roleBorrowOvertime = roleBorrowOvertime;
    }
}