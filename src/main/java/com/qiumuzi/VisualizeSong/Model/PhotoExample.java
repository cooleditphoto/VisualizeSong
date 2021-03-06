package com.qiumuzi.VisualizeSong.Model;

import java.util.ArrayList;
import java.util.List;

public class PhotoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public PhotoExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
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
     * This method corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andPathurlIsNull() {
            addCriterion("pathUrl is null");
            return (Criteria) this;
        }

        public Criteria andPathurlIsNotNull() {
            addCriterion("pathUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPathurlEqualTo(String value) {
            addCriterion("pathUrl =", value, "pathurl");
            return (Criteria) this;
        }

        public Criteria andPathurlNotEqualTo(String value) {
            addCriterion("pathUrl <>", value, "pathurl");
            return (Criteria) this;
        }

        public Criteria andPathurlGreaterThan(String value) {
            addCriterion("pathUrl >", value, "pathurl");
            return (Criteria) this;
        }

        public Criteria andPathurlGreaterThanOrEqualTo(String value) {
            addCriterion("pathUrl >=", value, "pathurl");
            return (Criteria) this;
        }

        public Criteria andPathurlLessThan(String value) {
            addCriterion("pathUrl <", value, "pathurl");
            return (Criteria) this;
        }

        public Criteria andPathurlLessThanOrEqualTo(String value) {
            addCriterion("pathUrl <=", value, "pathurl");
            return (Criteria) this;
        }

        public Criteria andPathurlLike(String value) {
            addCriterion("pathUrl like", value, "pathurl");
            return (Criteria) this;
        }

        public Criteria andPathurlNotLike(String value) {
            addCriterion("pathUrl not like", value, "pathurl");
            return (Criteria) this;
        }

        public Criteria andPathurlIn(List<String> values) {
            addCriterion("pathUrl in", values, "pathurl");
            return (Criteria) this;
        }

        public Criteria andPathurlNotIn(List<String> values) {
            addCriterion("pathUrl not in", values, "pathurl");
            return (Criteria) this;
        }

        public Criteria andPathurlBetween(String value1, String value2) {
            addCriterion("pathUrl between", value1, value2, "pathurl");
            return (Criteria) this;
        }

        public Criteria andPathurlNotBetween(String value1, String value2) {
            addCriterion("pathUrl not between", value1, value2, "pathurl");
            return (Criteria) this;
        }

        public Criteria andTagsIsNull() {
            addCriterion("tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("tags like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("tags not like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("tags not between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andSensitivityIsNull() {
            addCriterion("sensitivity is null");
            return (Criteria) this;
        }

        public Criteria andSensitivityIsNotNull() {
            addCriterion("sensitivity is not null");
            return (Criteria) this;
        }

        public Criteria andSensitivityEqualTo(Double value) {
            addCriterion("sensitivity =", value, "sensitivity");
            return (Criteria) this;
        }

        public Criteria andSensitivityNotEqualTo(Double value) {
            addCriterion("sensitivity <>", value, "sensitivity");
            return (Criteria) this;
        }

        public Criteria andSensitivityGreaterThan(Double value) {
            addCriterion("sensitivity >", value, "sensitivity");
            return (Criteria) this;
        }

        public Criteria andSensitivityGreaterThanOrEqualTo(Double value) {
            addCriterion("sensitivity >=", value, "sensitivity");
            return (Criteria) this;
        }

        public Criteria andSensitivityLessThan(Double value) {
            addCriterion("sensitivity <", value, "sensitivity");
            return (Criteria) this;
        }

        public Criteria andSensitivityLessThanOrEqualTo(Double value) {
            addCriterion("sensitivity <=", value, "sensitivity");
            return (Criteria) this;
        }

        public Criteria andSensitivityIn(List<Double> values) {
            addCriterion("sensitivity in", values, "sensitivity");
            return (Criteria) this;
        }

        public Criteria andSensitivityNotIn(List<Double> values) {
            addCriterion("sensitivity not in", values, "sensitivity");
            return (Criteria) this;
        }

        public Criteria andSensitivityBetween(Double value1, Double value2) {
            addCriterion("sensitivity between", value1, value2, "sensitivity");
            return (Criteria) this;
        }

        public Criteria andSensitivityNotBetween(Double value1, Double value2) {
            addCriterion("sensitivity not between", value1, value2, "sensitivity");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Photo
     *
     * @mbg.generated do_not_delete_during_merge Mon May 25 21:37:11 EDT 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
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