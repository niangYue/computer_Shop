package com.ch.computer.pojo;

import java.util.ArrayList;
import java.util.List;

public class DiskExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table disk
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table disk
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table disk
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disk
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public DiskExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disk
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disk
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disk
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disk
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disk
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disk
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disk
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disk
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
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
     * This method corresponds to the database table disk
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disk
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table disk
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andDIdIsNull() {
            addCriterion("d_id is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("d_id is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(Integer value) {
            addCriterion("d_id =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(Integer value) {
            addCriterion("d_id <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(Integer value) {
            addCriterion("d_id >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_id >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(Integer value) {
            addCriterion("d_id <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(Integer value) {
            addCriterion("d_id <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<Integer> values) {
            addCriterion("d_id in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<Integer> values) {
            addCriterion("d_id not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(Integer value1, Integer value2) {
            addCriterion("d_id between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(Integer value1, Integer value2) {
            addCriterion("d_id not between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDNameIsNull() {
            addCriterion("d_name is null");
            return (Criteria) this;
        }

        public Criteria andDNameIsNotNull() {
            addCriterion("d_name is not null");
            return (Criteria) this;
        }

        public Criteria andDNameEqualTo(String value) {
            addCriterion("d_name =", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotEqualTo(String value) {
            addCriterion("d_name <>", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThan(String value) {
            addCriterion("d_name >", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThanOrEqualTo(String value) {
            addCriterion("d_name >=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThan(String value) {
            addCriterion("d_name <", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThanOrEqualTo(String value) {
            addCriterion("d_name <=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLike(String value) {
            addCriterion("d_name like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotLike(String value) {
            addCriterion("d_name not like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameIn(List<String> values) {
            addCriterion("d_name in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotIn(List<String> values) {
            addCriterion("d_name not in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameBetween(String value1, String value2) {
            addCriterion("d_name between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotBetween(String value1, String value2) {
            addCriterion("d_name not between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDFactoryIsNull() {
            addCriterion("d_factory is null");
            return (Criteria) this;
        }

        public Criteria andDFactoryIsNotNull() {
            addCriterion("d_factory is not null");
            return (Criteria) this;
        }

        public Criteria andDFactoryEqualTo(String value) {
            addCriterion("d_factory =", value, "dFactory");
            return (Criteria) this;
        }

        public Criteria andDFactoryNotEqualTo(String value) {
            addCriterion("d_factory <>", value, "dFactory");
            return (Criteria) this;
        }

        public Criteria andDFactoryGreaterThan(String value) {
            addCriterion("d_factory >", value, "dFactory");
            return (Criteria) this;
        }

        public Criteria andDFactoryGreaterThanOrEqualTo(String value) {
            addCriterion("d_factory >=", value, "dFactory");
            return (Criteria) this;
        }

        public Criteria andDFactoryLessThan(String value) {
            addCriterion("d_factory <", value, "dFactory");
            return (Criteria) this;
        }

        public Criteria andDFactoryLessThanOrEqualTo(String value) {
            addCriterion("d_factory <=", value, "dFactory");
            return (Criteria) this;
        }

        public Criteria andDFactoryLike(String value) {
            addCriterion("d_factory like", value, "dFactory");
            return (Criteria) this;
        }

        public Criteria andDFactoryNotLike(String value) {
            addCriterion("d_factory not like", value, "dFactory");
            return (Criteria) this;
        }

        public Criteria andDFactoryIn(List<String> values) {
            addCriterion("d_factory in", values, "dFactory");
            return (Criteria) this;
        }

        public Criteria andDFactoryNotIn(List<String> values) {
            addCriterion("d_factory not in", values, "dFactory");
            return (Criteria) this;
        }

        public Criteria andDFactoryBetween(String value1, String value2) {
            addCriterion("d_factory between", value1, value2, "dFactory");
            return (Criteria) this;
        }

        public Criteria andDFactoryNotBetween(String value1, String value2) {
            addCriterion("d_factory not between", value1, value2, "dFactory");
            return (Criteria) this;
        }

        public Criteria andDParamIsNull() {
            addCriterion("d_param is null");
            return (Criteria) this;
        }

        public Criteria andDParamIsNotNull() {
            addCriterion("d_param is not null");
            return (Criteria) this;
        }

        public Criteria andDParamEqualTo(String value) {
            addCriterion("d_param =", value, "dParam");
            return (Criteria) this;
        }

        public Criteria andDParamNotEqualTo(String value) {
            addCriterion("d_param <>", value, "dParam");
            return (Criteria) this;
        }

        public Criteria andDParamGreaterThan(String value) {
            addCriterion("d_param >", value, "dParam");
            return (Criteria) this;
        }

        public Criteria andDParamGreaterThanOrEqualTo(String value) {
            addCriterion("d_param >=", value, "dParam");
            return (Criteria) this;
        }

        public Criteria andDParamLessThan(String value) {
            addCriterion("d_param <", value, "dParam");
            return (Criteria) this;
        }

        public Criteria andDParamLessThanOrEqualTo(String value) {
            addCriterion("d_param <=", value, "dParam");
            return (Criteria) this;
        }

        public Criteria andDParamLike(String value) {
            addCriterion("d_param like", value, "dParam");
            return (Criteria) this;
        }

        public Criteria andDParamNotLike(String value) {
            addCriterion("d_param not like", value, "dParam");
            return (Criteria) this;
        }

        public Criteria andDParamIn(List<String> values) {
            addCriterion("d_param in", values, "dParam");
            return (Criteria) this;
        }

        public Criteria andDParamNotIn(List<String> values) {
            addCriterion("d_param not in", values, "dParam");
            return (Criteria) this;
        }

        public Criteria andDParamBetween(String value1, String value2) {
            addCriterion("d_param between", value1, value2, "dParam");
            return (Criteria) this;
        }

        public Criteria andDParamNotBetween(String value1, String value2) {
            addCriterion("d_param not between", value1, value2, "dParam");
            return (Criteria) this;
        }

        public Criteria andDTypeIsNull() {
            addCriterion("d_type is null");
            return (Criteria) this;
        }

        public Criteria andDTypeIsNotNull() {
            addCriterion("d_type is not null");
            return (Criteria) this;
        }

        public Criteria andDTypeEqualTo(Integer value) {
            addCriterion("d_type =", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotEqualTo(Integer value) {
            addCriterion("d_type <>", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeGreaterThan(Integer value) {
            addCriterion("d_type >", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_type >=", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeLessThan(Integer value) {
            addCriterion("d_type <", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeLessThanOrEqualTo(Integer value) {
            addCriterion("d_type <=", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeIn(List<Integer> values) {
            addCriterion("d_type in", values, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotIn(List<Integer> values) {
            addCriterion("d_type not in", values, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeBetween(Integer value1, Integer value2) {
            addCriterion("d_type between", value1, value2, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("d_type not between", value1, value2, "dType");
            return (Criteria) this;
        }

        public Criteria andDPriceIsNull() {
            addCriterion("d_price is null");
            return (Criteria) this;
        }

        public Criteria andDPriceIsNotNull() {
            addCriterion("d_price is not null");
            return (Criteria) this;
        }

        public Criteria andDPriceEqualTo(Double value) {
            addCriterion("d_price =", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceNotEqualTo(Double value) {
            addCriterion("d_price <>", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceGreaterThan(Double value) {
            addCriterion("d_price >", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("d_price >=", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceLessThan(Double value) {
            addCriterion("d_price <", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceLessThanOrEqualTo(Double value) {
            addCriterion("d_price <=", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceIn(List<Double> values) {
            addCriterion("d_price in", values, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceNotIn(List<Double> values) {
            addCriterion("d_price not in", values, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceBetween(Double value1, Double value2) {
            addCriterion("d_price between", value1, value2, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceNotBetween(Double value1, Double value2) {
            addCriterion("d_price not between", value1, value2, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDInventoryIsNull() {
            addCriterion("d_inventory is null");
            return (Criteria) this;
        }

        public Criteria andDInventoryIsNotNull() {
            addCriterion("d_inventory is not null");
            return (Criteria) this;
        }

        public Criteria andDInventoryEqualTo(Integer value) {
            addCriterion("d_inventory =", value, "dInventory");
            return (Criteria) this;
        }

        public Criteria andDInventoryNotEqualTo(Integer value) {
            addCriterion("d_inventory <>", value, "dInventory");
            return (Criteria) this;
        }

        public Criteria andDInventoryGreaterThan(Integer value) {
            addCriterion("d_inventory >", value, "dInventory");
            return (Criteria) this;
        }

        public Criteria andDInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_inventory >=", value, "dInventory");
            return (Criteria) this;
        }

        public Criteria andDInventoryLessThan(Integer value) {
            addCriterion("d_inventory <", value, "dInventory");
            return (Criteria) this;
        }

        public Criteria andDInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("d_inventory <=", value, "dInventory");
            return (Criteria) this;
        }

        public Criteria andDInventoryIn(List<Integer> values) {
            addCriterion("d_inventory in", values, "dInventory");
            return (Criteria) this;
        }

        public Criteria andDInventoryNotIn(List<Integer> values) {
            addCriterion("d_inventory not in", values, "dInventory");
            return (Criteria) this;
        }

        public Criteria andDInventoryBetween(Integer value1, Integer value2) {
            addCriterion("d_inventory between", value1, value2, "dInventory");
            return (Criteria) this;
        }

        public Criteria andDInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("d_inventory not between", value1, value2, "dInventory");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table disk
     *
     * @mbggenerated do_not_delete_during_merge Mon Aug 07 22:26:32 CST 2023
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table disk
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
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