package com.ch.computer.pojo;

import java.util.ArrayList;
import java.util.List;

public class MainboardExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mainboard
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mainboard
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mainboard
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mainboard
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public MainboardExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mainboard
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mainboard
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mainboard
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mainboard
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mainboard
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mainboard
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mainboard
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
     * This method corresponds to the database table mainboard
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
     * This method corresponds to the database table mainboard
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mainboard
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
     * This class corresponds to the database table mainboard
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

        public Criteria andMbIdIsNull() {
            addCriterion("mb_id is null");
            return (Criteria) this;
        }

        public Criteria andMbIdIsNotNull() {
            addCriterion("mb_id is not null");
            return (Criteria) this;
        }

        public Criteria andMbIdEqualTo(Integer value) {
            addCriterion("mb_id =", value, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdNotEqualTo(Integer value) {
            addCriterion("mb_id <>", value, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdGreaterThan(Integer value) {
            addCriterion("mb_id >", value, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mb_id >=", value, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdLessThan(Integer value) {
            addCriterion("mb_id <", value, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdLessThanOrEqualTo(Integer value) {
            addCriterion("mb_id <=", value, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdIn(List<Integer> values) {
            addCriterion("mb_id in", values, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdNotIn(List<Integer> values) {
            addCriterion("mb_id not in", values, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdBetween(Integer value1, Integer value2) {
            addCriterion("mb_id between", value1, value2, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mb_id not between", value1, value2, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbNameIsNull() {
            addCriterion("mb_name is null");
            return (Criteria) this;
        }

        public Criteria andMbNameIsNotNull() {
            addCriterion("mb_name is not null");
            return (Criteria) this;
        }

        public Criteria andMbNameEqualTo(String value) {
            addCriterion("mb_name =", value, "mbName");
            return (Criteria) this;
        }

        public Criteria andMbNameNotEqualTo(String value) {
            addCriterion("mb_name <>", value, "mbName");
            return (Criteria) this;
        }

        public Criteria andMbNameGreaterThan(String value) {
            addCriterion("mb_name >", value, "mbName");
            return (Criteria) this;
        }

        public Criteria andMbNameGreaterThanOrEqualTo(String value) {
            addCriterion("mb_name >=", value, "mbName");
            return (Criteria) this;
        }

        public Criteria andMbNameLessThan(String value) {
            addCriterion("mb_name <", value, "mbName");
            return (Criteria) this;
        }

        public Criteria andMbNameLessThanOrEqualTo(String value) {
            addCriterion("mb_name <=", value, "mbName");
            return (Criteria) this;
        }

        public Criteria andMbNameLike(String value) {
            addCriterion("mb_name like", value, "mbName");
            return (Criteria) this;
        }

        public Criteria andMbNameNotLike(String value) {
            addCriterion("mb_name not like", value, "mbName");
            return (Criteria) this;
        }

        public Criteria andMbNameIn(List<String> values) {
            addCriterion("mb_name in", values, "mbName");
            return (Criteria) this;
        }

        public Criteria andMbNameNotIn(List<String> values) {
            addCriterion("mb_name not in", values, "mbName");
            return (Criteria) this;
        }

        public Criteria andMbNameBetween(String value1, String value2) {
            addCriterion("mb_name between", value1, value2, "mbName");
            return (Criteria) this;
        }

        public Criteria andMbNameNotBetween(String value1, String value2) {
            addCriterion("mb_name not between", value1, value2, "mbName");
            return (Criteria) this;
        }

        public Criteria andMbFactoryIsNull() {
            addCriterion("mb_factory is null");
            return (Criteria) this;
        }

        public Criteria andMbFactoryIsNotNull() {
            addCriterion("mb_factory is not null");
            return (Criteria) this;
        }

        public Criteria andMbFactoryEqualTo(String value) {
            addCriterion("mb_factory =", value, "mbFactory");
            return (Criteria) this;
        }

        public Criteria andMbFactoryNotEqualTo(String value) {
            addCriterion("mb_factory <>", value, "mbFactory");
            return (Criteria) this;
        }

        public Criteria andMbFactoryGreaterThan(String value) {
            addCriterion("mb_factory >", value, "mbFactory");
            return (Criteria) this;
        }

        public Criteria andMbFactoryGreaterThanOrEqualTo(String value) {
            addCriterion("mb_factory >=", value, "mbFactory");
            return (Criteria) this;
        }

        public Criteria andMbFactoryLessThan(String value) {
            addCriterion("mb_factory <", value, "mbFactory");
            return (Criteria) this;
        }

        public Criteria andMbFactoryLessThanOrEqualTo(String value) {
            addCriterion("mb_factory <=", value, "mbFactory");
            return (Criteria) this;
        }

        public Criteria andMbFactoryLike(String value) {
            addCriterion("mb_factory like", value, "mbFactory");
            return (Criteria) this;
        }

        public Criteria andMbFactoryNotLike(String value) {
            addCriterion("mb_factory not like", value, "mbFactory");
            return (Criteria) this;
        }

        public Criteria andMbFactoryIn(List<String> values) {
            addCriterion("mb_factory in", values, "mbFactory");
            return (Criteria) this;
        }

        public Criteria andMbFactoryNotIn(List<String> values) {
            addCriterion("mb_factory not in", values, "mbFactory");
            return (Criteria) this;
        }

        public Criteria andMbFactoryBetween(String value1, String value2) {
            addCriterion("mb_factory between", value1, value2, "mbFactory");
            return (Criteria) this;
        }

        public Criteria andMbFactoryNotBetween(String value1, String value2) {
            addCriterion("mb_factory not between", value1, value2, "mbFactory");
            return (Criteria) this;
        }

        public Criteria andMbParamIsNull() {
            addCriterion("mb_param is null");
            return (Criteria) this;
        }

        public Criteria andMbParamIsNotNull() {
            addCriterion("mb_param is not null");
            return (Criteria) this;
        }

        public Criteria andMbParamEqualTo(String value) {
            addCriterion("mb_param =", value, "mbParam");
            return (Criteria) this;
        }

        public Criteria andMbParamNotEqualTo(String value) {
            addCriterion("mb_param <>", value, "mbParam");
            return (Criteria) this;
        }

        public Criteria andMbParamGreaterThan(String value) {
            addCriterion("mb_param >", value, "mbParam");
            return (Criteria) this;
        }

        public Criteria andMbParamGreaterThanOrEqualTo(String value) {
            addCriterion("mb_param >=", value, "mbParam");
            return (Criteria) this;
        }

        public Criteria andMbParamLessThan(String value) {
            addCriterion("mb_param <", value, "mbParam");
            return (Criteria) this;
        }

        public Criteria andMbParamLessThanOrEqualTo(String value) {
            addCriterion("mb_param <=", value, "mbParam");
            return (Criteria) this;
        }

        public Criteria andMbParamLike(String value) {
            addCriterion("mb_param like", value, "mbParam");
            return (Criteria) this;
        }

        public Criteria andMbParamNotLike(String value) {
            addCriterion("mb_param not like", value, "mbParam");
            return (Criteria) this;
        }

        public Criteria andMbParamIn(List<String> values) {
            addCriterion("mb_param in", values, "mbParam");
            return (Criteria) this;
        }

        public Criteria andMbParamNotIn(List<String> values) {
            addCriterion("mb_param not in", values, "mbParam");
            return (Criteria) this;
        }

        public Criteria andMbParamBetween(String value1, String value2) {
            addCriterion("mb_param between", value1, value2, "mbParam");
            return (Criteria) this;
        }

        public Criteria andMbParamNotBetween(String value1, String value2) {
            addCriterion("mb_param not between", value1, value2, "mbParam");
            return (Criteria) this;
        }

        public Criteria andMbPriceIsNull() {
            addCriterion("mb_price is null");
            return (Criteria) this;
        }

        public Criteria andMbPriceIsNotNull() {
            addCriterion("mb_price is not null");
            return (Criteria) this;
        }

        public Criteria andMbPriceEqualTo(Double value) {
            addCriterion("mb_price =", value, "mbPrice");
            return (Criteria) this;
        }

        public Criteria andMbPriceNotEqualTo(Double value) {
            addCriterion("mb_price <>", value, "mbPrice");
            return (Criteria) this;
        }

        public Criteria andMbPriceGreaterThan(Double value) {
            addCriterion("mb_price >", value, "mbPrice");
            return (Criteria) this;
        }

        public Criteria andMbPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("mb_price >=", value, "mbPrice");
            return (Criteria) this;
        }

        public Criteria andMbPriceLessThan(Double value) {
            addCriterion("mb_price <", value, "mbPrice");
            return (Criteria) this;
        }

        public Criteria andMbPriceLessThanOrEqualTo(Double value) {
            addCriterion("mb_price <=", value, "mbPrice");
            return (Criteria) this;
        }

        public Criteria andMbPriceIn(List<Double> values) {
            addCriterion("mb_price in", values, "mbPrice");
            return (Criteria) this;
        }

        public Criteria andMbPriceNotIn(List<Double> values) {
            addCriterion("mb_price not in", values, "mbPrice");
            return (Criteria) this;
        }

        public Criteria andMbPriceBetween(Double value1, Double value2) {
            addCriterion("mb_price between", value1, value2, "mbPrice");
            return (Criteria) this;
        }

        public Criteria andMbPriceNotBetween(Double value1, Double value2) {
            addCriterion("mb_price not between", value1, value2, "mbPrice");
            return (Criteria) this;
        }

        public Criteria andMbInventoryIsNull() {
            addCriterion("mb_inventory is null");
            return (Criteria) this;
        }

        public Criteria andMbInventoryIsNotNull() {
            addCriterion("mb_inventory is not null");
            return (Criteria) this;
        }

        public Criteria andMbInventoryEqualTo(Integer value) {
            addCriterion("mb_inventory =", value, "mbInventory");
            return (Criteria) this;
        }

        public Criteria andMbInventoryNotEqualTo(Integer value) {
            addCriterion("mb_inventory <>", value, "mbInventory");
            return (Criteria) this;
        }

        public Criteria andMbInventoryGreaterThan(Integer value) {
            addCriterion("mb_inventory >", value, "mbInventory");
            return (Criteria) this;
        }

        public Criteria andMbInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("mb_inventory >=", value, "mbInventory");
            return (Criteria) this;
        }

        public Criteria andMbInventoryLessThan(Integer value) {
            addCriterion("mb_inventory <", value, "mbInventory");
            return (Criteria) this;
        }

        public Criteria andMbInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("mb_inventory <=", value, "mbInventory");
            return (Criteria) this;
        }

        public Criteria andMbInventoryIn(List<Integer> values) {
            addCriterion("mb_inventory in", values, "mbInventory");
            return (Criteria) this;
        }

        public Criteria andMbInventoryNotIn(List<Integer> values) {
            addCriterion("mb_inventory not in", values, "mbInventory");
            return (Criteria) this;
        }

        public Criteria andMbInventoryBetween(Integer value1, Integer value2) {
            addCriterion("mb_inventory between", value1, value2, "mbInventory");
            return (Criteria) this;
        }

        public Criteria andMbInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("mb_inventory not between", value1, value2, "mbInventory");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table mainboard
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
     * This class corresponds to the database table mainboard
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