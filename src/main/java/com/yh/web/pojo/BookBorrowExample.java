package com.yh.web.pojo;

import java.util.ArrayList;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;

public class BookBorrowExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_book_borrow
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_book_borrow
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_book_borrow
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_borrow
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public BookBorrowExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_borrow
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_borrow
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_borrow
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_borrow
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_borrow
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_borrow
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_borrow
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_borrow
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_borrow
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_borrow
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_book_borrow
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andBorrowIdIsNull() {
            addCriterion("borrow_id is null");
            return (Criteria) this;
        }

        public Criteria andBorrowIdIsNotNull() {
            addCriterion("borrow_id is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowIdEqualTo(Integer value) {
            addCriterion("borrow_id =", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdNotEqualTo(Integer value) {
            addCriterion("borrow_id <>", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdGreaterThan(Integer value) {
            addCriterion("borrow_id >", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_id >=", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdLessThan(Integer value) {
            addCriterion("borrow_id <", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_id <=", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdIn(List<Integer> values) {
            addCriterion("borrow_id in", values, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdNotIn(List<Integer> values) {
            addCriterion("borrow_id not in", values, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdBetween(Integer value1, Integer value2) {
            addCriterion("borrow_id between", value1, value2, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_id not between", value1, value2, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBookIsbnIsNull() {
            addCriterion("book_ISBN is null");
            return (Criteria) this;
        }

        public Criteria andBookIsbnIsNotNull() {
            addCriterion("book_ISBN is not null");
            return (Criteria) this;
        }

        public Criteria andBookIsbnEqualTo(String value) {
            addCriterion("book_ISBN =", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnNotEqualTo(String value) {
            addCriterion("book_ISBN <>", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnGreaterThan(String value) {
            addCriterion("book_ISBN >", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("book_ISBN >=", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnLessThan(String value) {
            addCriterion("book_ISBN <", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnLessThanOrEqualTo(String value) {
            addCriterion("book_ISBN <=", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnLike(String value) {
            addCriterion("book_ISBN like", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnNotLike(String value) {
            addCriterion("book_ISBN not like", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnIn(List<String> values) {
            addCriterion("book_ISBN in", values, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnNotIn(List<String> values) {
            addCriterion("book_ISBN not in", values, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnBetween(String value1, String value2) {
            addCriterion("book_ISBN between", value1, value2, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnNotBetween(String value1, String value2) {
            addCriterion("book_ISBN not between", value1, value2, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andOrdinaryNumberIsNull() {
            addCriterion("ordinary_number is null");
            return (Criteria) this;
        }

        public Criteria andOrdinaryNumberIsNotNull() {
            addCriterion("ordinary_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrdinaryNumberEqualTo(String value) {
            addCriterion("ordinary_number =", value, "ordinaryNumber");
            return (Criteria) this;
        }

        public Criteria andOrdinaryNumberNotEqualTo(String value) {
            addCriterion("ordinary_number <>", value, "ordinaryNumber");
            return (Criteria) this;
        }

        public Criteria andOrdinaryNumberGreaterThan(String value) {
            addCriterion("ordinary_number >", value, "ordinaryNumber");
            return (Criteria) this;
        }

        public Criteria andOrdinaryNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ordinary_number >=", value, "ordinaryNumber");
            return (Criteria) this;
        }

        public Criteria andOrdinaryNumberLessThan(String value) {
            addCriterion("ordinary_number <", value, "ordinaryNumber");
            return (Criteria) this;
        }

        public Criteria andOrdinaryNumberLessThanOrEqualTo(String value) {
            addCriterion("ordinary_number <=", value, "ordinaryNumber");
            return (Criteria) this;
        }

        public Criteria andOrdinaryNumberLike(String value) {
            addCriterion("ordinary_number like", value, "ordinaryNumber");
            return (Criteria) this;
        }

        public Criteria andOrdinaryNumberNotLike(String value) {
            addCriterion("ordinary_number not like", value, "ordinaryNumber");
            return (Criteria) this;
        }

        public Criteria andOrdinaryNumberIn(List<String> values) {
            addCriterion("ordinary_number in", values, "ordinaryNumber");
            return (Criteria) this;
        }

        public Criteria andOrdinaryNumberNotIn(List<String> values) {
            addCriterion("ordinary_number not in", values, "ordinaryNumber");
            return (Criteria) this;
        }

        public Criteria andOrdinaryNumberBetween(String value1, String value2) {
            addCriterion("ordinary_number between", value1, value2, "ordinaryNumber");
            return (Criteria) this;
        }

        public Criteria andOrdinaryNumberNotBetween(String value1, String value2) {
            addCriterion("ordinary_number not between", value1, value2, "ordinaryNumber");
            return (Criteria) this;
        }

        public Criteria andBorrowLoanDateIsNull() {
            addCriterion("borrow_loan_date is null");
            return (Criteria) this;
        }

        public Criteria andBorrowLoanDateIsNotNull() {
            addCriterion("borrow_loan_date is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowLoanDateEqualTo(Date value) {
            addCriterionForJDBCDate("borrow_loan_date =", value, "borrowLoanDate");
            return (Criteria) this;
        }

        public Criteria andBorrowLoanDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("borrow_loan_date <>", value, "borrowLoanDate");
            return (Criteria) this;
        }

        public Criteria andBorrowLoanDateGreaterThan(Date value) {
            addCriterionForJDBCDate("borrow_loan_date >", value, "borrowLoanDate");
            return (Criteria) this;
        }

        public Criteria andBorrowLoanDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("borrow_loan_date >=", value, "borrowLoanDate");
            return (Criteria) this;
        }

        public Criteria andBorrowLoanDateLessThan(Date value) {
            addCriterionForJDBCDate("borrow_loan_date <", value, "borrowLoanDate");
            return (Criteria) this;
        }

        public Criteria andBorrowLoanDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("borrow_loan_date <=", value, "borrowLoanDate");
            return (Criteria) this;
        }

        public Criteria andBorrowLoanDateIn(List<Date> values) {
            addCriterionForJDBCDate("borrow_loan_date in", values, "borrowLoanDate");
            return (Criteria) this;
        }

        public Criteria andBorrowLoanDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("borrow_loan_date not in", values, "borrowLoanDate");
            return (Criteria) this;
        }

        public Criteria andBorrowLoanDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("borrow_loan_date between", value1, value2, "borrowLoanDate");
            return (Criteria) this;
        }

        public Criteria andBorrowLoanDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("borrow_loan_date not between", value1, value2, "borrowLoanDate");
            return (Criteria) this;
        }

        public Criteria andBorrowReturnDateIsNull() {
            addCriterion("borrow_return_date is null");
            return (Criteria) this;
        }

        public Criteria andBorrowReturnDateIsNotNull() {
            addCriterion("borrow_return_date is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowReturnDateEqualTo(Date value) {
            addCriterionForJDBCDate("borrow_return_date =", value, "borrowReturnDate");
            return (Criteria) this;
        }

        public Criteria andBorrowReturnDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("borrow_return_date <>", value, "borrowReturnDate");
            return (Criteria) this;
        }

        public Criteria andBorrowReturnDateGreaterThan(Date value) {
            addCriterionForJDBCDate("borrow_return_date >", value, "borrowReturnDate");
            return (Criteria) this;
        }

        public Criteria andBorrowReturnDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("borrow_return_date >=", value, "borrowReturnDate");
            return (Criteria) this;
        }

        public Criteria andBorrowReturnDateLessThan(Date value) {
            addCriterionForJDBCDate("borrow_return_date <", value, "borrowReturnDate");
            return (Criteria) this;
        }

        public Criteria andBorrowReturnDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("borrow_return_date <=", value, "borrowReturnDate");
            return (Criteria) this;
        }

        public Criteria andBorrowReturnDateIn(List<Date> values) {
            addCriterionForJDBCDate("borrow_return_date in", values, "borrowReturnDate");
            return (Criteria) this;
        }

        public Criteria andBorrowReturnDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("borrow_return_date not in", values, "borrowReturnDate");
            return (Criteria) this;
        }

        public Criteria andBorrowReturnDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("borrow_return_date between", value1, value2, "borrowReturnDate");
            return (Criteria) this;
        }

        public Criteria andBorrowReturnDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("borrow_return_date not between", value1, value2, "borrowReturnDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_book_borrow
     *
     * @mbg.generated do_not_delete_during_merge Wed Dec 14 13:07:44 AWST 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_book_borrow
     *
     * @mbg.generated Wed Dec 14 13:07:44 AWST 2022
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}