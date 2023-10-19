package com.ch.computer.pojo;

import java.util.ArrayList;
import java.util.List;

public class SourceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table source
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table source
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table source
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table source
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public SourceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table source
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table source
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table source
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table source
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table source
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table source
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table source
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
     * This method corresponds to the database table source
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
     * This method corresponds to the database table source
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table source
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
     * This class corresponds to the database table source
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSFactoryIsNull() {
            addCriterion("s_factory is null");
            return (Criteria) this;
        }

        public Criteria andSFactoryIsNotNull() {
            addCriterion("s_factory is not null");
            return (Criteria) this;
        }

        public Criteria andSFactoryEqualTo(String value) {
            addCriterion("s_factory =", value, "sFactory");
            return (Criteria) this;
        }

        public Criteria andSFactoryNotEqualTo(String value) {
            addCriterion("s_factory <>", value, "sFactory");
            return (Criteria) this;
        }

        public Criteria andSFactoryGreaterThan(String value) {
            addCriterion("s_factory >", value, "sFactory");
            return (Criteria) this;
        }

        public Criteria andSFactoryGreaterThanOrEqualTo(String value) {
            addCriterion("s_factory >=", value, "sFactory");
            return (Criteria) this;
        }

        public Criteria andSFactoryLessThan(String value) {
            addCriterion("s_factory <", value, "sFactory");
            return (Criteria) this;
        }

        public Criteria andSFactoryLessThanOrEqualTo(String value) {
            addCriterion("s_factory <=", value, "sFactory");
            return (Criteria) this;
        }

        public Criteria andSFactoryLike(String value) {
            addCriterion("s_factory like", value, "sFactory");
            return (Criteria) this;
        }

        public Criteria andSFactoryNotLike(String value) {
            addCriterion("s_factory not like", value, "sFactory");
            return (Criteria) this;
        }

        public Criteria andSFactoryIn(List<String> values) {
            addCriterion("s_factory in", values, "sFactory");
            return (Criteria) this;
        }

        public Criteria andSFactoryNotIn(List<String> values) {
            addCriterion("s_factory not in", values, "sFactory");
            return (Criteria) this;
        }

        public Criteria andSFactoryBetween(String value1, String value2) {
            addCriterion("s_factory between", value1, value2, "sFactory");
            return (Criteria) this;
        }

        public Criteria andSFactoryNotBetween(String value1, String value2) {
            addCriterion("s_factory not between", value1, value2, "sFactory");
            return (Criteria) this;
        }

        public Criteria andSParamIsNull() {
            addCriterion("s_param is null");
            return (Criteria) this;
        }

        public Criteria andSParamIsNotNull() {
            addCriterion("s_param is not null");
            return (Criteria) this;
        }

        public Criteria andSParamEqualTo(String value) {
            addCriterion("s_param =", value, "sParam");
            return (Criteria) this;
        }

        public Criteria andSParamNotEqualTo(String value) {
            addCriterion("s_param <>", value, "sParam");
            return (Criteria) this;
        }

        public Criteria andSParamGreaterThan(String value) {
            addCriterion("s_param >", value, "sParam");
            return (Criteria) this;
        }

        public Criteria andSParamGreaterThanOrEqualTo(String value) {
            addCriterion("s_param >=", value, "sParam");
            return (Criteria) this;
        }

        public Criteria andSParamLessThan(String value) {
            addCriterion("s_param <", value, "sParam");
            return (Criteria) this;
        }

        public Criteria andSParamLessThanOrEqualTo(String value) {
            addCriterion("s_param <=", value, "sParam");
            return (Criteria) this;
        }

        public Criteria andSParamLike(String value) {
            addCriterion("s_param like", value, "sParam");
            return (Criteria) this;
        }

        public Criteria andSParamNotLike(String value) {
            addCriterion("s_param not like", value, "sParam");
            return (Criteria) this;
        }

        public Criteria andSParamIn(List<String> values) {
            addCriterion("s_param in", values, "sParam");
            return (Criteria) this;
        }

        public Criteria andSParamNotIn(List<String> values) {
            addCriterion("s_param not in", values, "sParam");
            return (Criteria) this;
        }

        public Criteria andSParamBetween(String value1, String value2) {
            addCriterion("s_param between", value1, value2, "sParam");
            return (Criteria) this;
        }

        public Criteria andSParamNotBetween(String value1, String value2) {
            addCriterion("s_param not between", value1, value2, "sParam");
            return (Criteria) this;
        }

        public Criteria andSPriceIsNull() {
            addCriterion("s_price is null");
            return (Criteria) this;
        }

        public Criteria andSPriceIsNotNull() {
            addCriterion("s_price is not null");
            return (Criteria) this;
        }

        public Criteria andSPriceEqualTo(Double value) {
            addCriterion("s_price =", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceNotEqualTo(Double value) {
            addCriterion("s_price <>", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceGreaterThan(Double value) {
            addCriterion("s_price >", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("s_price >=", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceLessThan(Double value) {
            addCriterion("s_price <", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceLessThanOrEqualTo(Double value) {
            addCriterion("s_price <=", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceIn(List<Double> values) {
            addCriterion("s_price in", values, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceNotIn(List<Double> values) {
            addCriterion("s_price not in", values, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceBetween(Double value1, Double value2) {
            addCriterion("s_price between", value1, value2, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceNotBetween(Double value1, Double value2) {
            addCriterion("s_price not between", value1, value2, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSInventoryIsNull() {
            addCriterion("s_inventory is null");
            return (Criteria) this;
        }

        public Criteria andSInventoryIsNotNull() {
            addCriterion("s_inventory is not null");
            return (Criteria) this;
        }

        public Criteria andSInventoryEqualTo(Integer value) {
            addCriterion("s_inventory =", value, "sInventory");
            return (Criteria) this;
        }

        public Criteria andSInventoryNotEqualTo(Integer value) {
            addCriterion("s_inventory <>", value, "sInventory");
            return (Criteria) this;
        }

        public Criteria andSInventoryGreaterThan(Integer value) {
            addCriterion("s_inventory >", value, "sInventory");
            return (Criteria) this;
        }

        public Criteria andSInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_inventory >=", value, "sInventory");
            return (Criteria) this;
        }

        public Criteria andSInventoryLessThan(Integer value) {
            addCriterion("s_inventory <", value, "sInventory");
            return (Criteria) this;
        }

        public Criteria andSInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("s_inventory <=", value, "sInventory");
            return (Criteria) this;
        }

        public Criteria andSInventoryIn(List<Integer> values) {
            addCriterion("s_inventory in", values, "sInventory");
            return (Criteria) this;
        }

        public Criteria andSInventoryNotIn(List<Integer> values) {
            addCriterion("s_inventory not in", values, "sInventory");
            return (Criteria) this;
        }

        public Criteria andSInventoryBetween(Integer value1, Integer value2) {
            addCriterion("s_inventory between", value1, value2, "sInventory");
            return (Criteria) this;
        }

        public Criteria andSInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("s_inventory not between", value1, value2, "sInventory");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table source
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
     * This class corresponds to the database table source
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