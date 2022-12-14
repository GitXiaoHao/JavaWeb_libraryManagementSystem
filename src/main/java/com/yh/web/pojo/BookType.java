package com.yh.web.pojo;

public class BookType extends BookTypeKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_book_type.book_type_name
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    private String bookTypeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_book_type.book_type_demo
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    private String bookTypeDemo;

    @Override
    public String toString() {
        return "BookType{" +
                       "bookTypeName='" + bookTypeName + '\'' +
                       ", bookTypeDemo='" + bookTypeDemo + '\'' +
                       '}';
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_book_type.book_type_name
     *
     * @return the value of t_book_type.book_type_name
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public String getBookTypeName() {
        return bookTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_book_type.book_type_name
     *
     * @param bookTypeName the value for t_book_type.book_type_name
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public void setBookTypeName(String bookTypeName) {
        this.bookTypeName = bookTypeName == null ? null : bookTypeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_book_type.book_type_demo
     *
     * @return the value of t_book_type.book_type_demo
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public String getBookTypeDemo() {
        return bookTypeDemo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_book_type.book_type_demo
     *
     * @param bookTypeDemo the value for t_book_type.book_type_demo
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public void setBookTypeDemo(String bookTypeDemo) {
        this.bookTypeDemo = bookTypeDemo == null ? null : bookTypeDemo.trim();
    }
}