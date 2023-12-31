package com.ch.computer.pojo;

import java.util.ArrayList;
import java.util.List;

public class HeatDissipationExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table heat_dissipation
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table heat_dissipation
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table heat_dissipation
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table heat_dissipation
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public HeatDissipationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table heat_dissipation
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table heat_dissipation
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table heat_dissipation
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table heat_dissipation
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table heat_dissipation
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table heat_dissipation
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table heat_dissipation
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
     * This method corresponds to the database table heat_dissipation
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
     * This method corresponds to the database table heat_dissipation
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table heat_dissipation
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
     * This class corresponds to the database table heat_dissipation
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

        public Criteria andHIdIsNull() {
            addCriterion("h_id is null");
            return (Criteria) this;
        }

        public Criteria andHIdIsNotNull() {
            addCriterion("h_id is not null");
            return (Criteria) this;
        }

        public Criteria andHIdEqualTo(Integer value) {
            addCriterion("h_id =", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotEqualTo(Integer value) {
            addCriterion("h_id <>", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThan(Integer value) {
            addCriterion("h_id >", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_id >=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThan(Integer value) {
            addCriterion("h_id <", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThanOrEqualTo(Integer value) {
            addCriterion("h_id <=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdIn(List<Integer> values) {
            addCriterion("h_id in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotIn(List<Integer> values) {
            addCriterion("h_id not in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdBetween(Integer value1, Integer value2) {
            addCriterion("h_id between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotBetween(Integer value1, Integer value2) {
            addCriterion("h_id not between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHNameIsNull() {
            addCriterion("h_name is null");
            return (Criteria) this;
        }

        public Criteria andHNameIsNotNull() {
            addCriterion("h_name is not null");
            return (Criteria) this;
        }

        public Criteria andHNameEqualTo(String value) {
            addCriterion("h_name =", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotEqualTo(String value) {
            addCriterion("h_name <>", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameGreaterThan(String value) {
            addCriterion("h_name >", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameGreaterThanOrEqualTo(String value) {
            addCriterion("h_name >=", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameLessThan(String value) {
            addCriterion("h_name <", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameLessThanOrEqualTo(String value) {
            addCriterion("h_name <=", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameLike(String value) {
            addCriterion("h_name like", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotLike(String value) {
            addCriterion("h_name not like", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameIn(List<String> values) {
            addCriterion("h_name in", values, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotIn(List<String> values) {
            addCriterion("h_name not in", values, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameBetween(String value1, String value2) {
            addCriterion("h_name between", value1, value2, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotBetween(String value1, String value2) {
            addCriterion("h_name not between", value1, value2, "hName");
            return (Criteria) this;
        }

        public Criteria andHFactoryIsNull() {
            addCriterion("h_factory is null");
            return (Criteria) this;
        }

        public Criteria andHFactoryIsNotNull() {
            addCriterion("h_factory is not null");
            return (Criteria) this;
        }

        public Criteria andHFactoryEqualTo(String value) {
            addCriterion("h_factory =", value, "hFactory");
            return (Criteria) this;
        }

        public Criteria andHFactoryNotEqualTo(String value) {
            addCriterion("h_factory <>", value, "hFactory");
            return (Criteria) this;
        }

        public Criteria andHFactoryGreaterThan(String value) {
            addCriterion("h_factory >", value, "hFactory");
            return (Criteria) this;
        }

        public Criteria andHFactoryGreaterThanOrEqualTo(String value) {
            addCriterion("h_factory >=", value, "hFactory");
            return (Criteria) this;
        }

        public Criteria andHFactoryLessThan(String value) {
            addCriterion("h_factory <", value, "hFactory");
            return (Criteria) this;
        }

        public Criteria andHFactoryLessThanOrEqualTo(String value) {
            addCriterion("h_factory <=", value, "hFactory");
            return (Criteria) this;
        }

        public Criteria andHFactoryLike(String value) {
            addCriterion("h_factory like", value, "hFactory");
            return (Criteria) this;
        }

        public Criteria andHFactoryNotLike(String value) {
            addCriterion("h_factory not like", value, "hFactory");
            return (Criteria) this;
        }

        public Criteria andHFactoryIn(List<String> values) {
            addCriterion("h_factory in", values, "hFactory");
            return (Criteria) this;
        }

        public Criteria andHFactoryNotIn(List<String> values) {
            addCriterion("h_factory not in", values, "hFactory");
            return (Criteria) this;
        }

        public Criteria andHFactoryBetween(String value1, String value2) {
            addCriterion("h_factory between", value1, value2, "hFactory");
            return (Criteria) this;
        }

        public Criteria andHFactoryNotBetween(String value1, String value2) {
            addCriterion("h_factory not between", value1, value2, "hFactory");
            return (Criteria) this;
        }

        public Criteria andHParamIsNull() {
            addCriterion("h_param is null");
            return (Criteria) this;
        }

        public Criteria andHParamIsNotNull() {
            addCriterion("h_param is not null");
            return (Criteria) this;
        }

        public Criteria andHParamEqualTo(String value) {
            addCriterion("h_param =", value, "hParam");
            return (Criteria) this;
        }

        public Criteria andHParamNotEqualTo(String value) {
            addCriterion("h_param <>", value, "hParam");
            return (Criteria) this;
        }

        public Criteria andHParamGreaterThan(String value) {
            addCriterion("h_param >", value, "hParam");
            return (Criteria) this;
        }

        public Criteria andHParamGreaterThanOrEqualTo(String value) {
            addCriterion("h_param >=", value, "hParam");
            return (Criteria) this;
        }

        public Criteria andHParamLessThan(String value) {
            addCriterion("h_param <", value, "hParam");
            return (Criteria) this;
        }

        public Criteria andHParamLessThanOrEqualTo(String value) {
            addCriterion("h_param <=", value, "hParam");
            return (Criteria) this;
        }

        public Criteria andHParamLike(String value) {
            addCriterion("h_param like", value, "hParam");
            return (Criteria) this;
        }

        public Criteria andHParamNotLike(String value) {
            addCriterion("h_param not like", value, "hParam");
            return (Criteria) this;
        }

        public Criteria andHParamIn(List<String> values) {
            addCriterion("h_param in", values, "hParam");
            return (Criteria) this;
        }

        public Criteria andHParamNotIn(List<String> values) {
            addCriterion("h_param not in", values, "hParam");
            return (Criteria) this;
        }

        public Criteria andHParamBetween(String value1, String value2) {
            addCriterion("h_param between", value1, value2, "hParam");
            return (Criteria) this;
        }

        public Criteria andHParamNotBetween(String value1, String value2) {
            addCriterion("h_param not between", value1, value2, "hParam");
            return (Criteria) this;
        }

        public Criteria andHTypeIsNull() {
            addCriterion("h_type is null");
            return (Criteria) this;
        }

        public Criteria andHTypeIsNotNull() {
            addCriterion("h_type is not null");
            return (Criteria) this;
        }

        public Criteria andHTypeEqualTo(Integer value) {
            addCriterion("h_type =", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotEqualTo(Integer value) {
            addCriterion("h_type <>", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeGreaterThan(Integer value) {
            addCriterion("h_type >", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_type >=", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeLessThan(Integer value) {
            addCriterion("h_type <", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeLessThanOrEqualTo(Integer value) {
            addCriterion("h_type <=", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeIn(List<Integer> values) {
            addCriterion("h_type in", values, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotIn(List<Integer> values) {
            addCriterion("h_type not in", values, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeBetween(Integer value1, Integer value2) {
            addCriterion("h_type between", value1, value2, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("h_type not between", value1, value2, "hType");
            return (Criteria) this;
        }

        public Criteria andHPriceIsNull() {
            addCriterion("h_price is null");
            return (Criteria) this;
        }

        public Criteria andHPriceIsNotNull() {
            addCriterion("h_price is not null");
            return (Criteria) this;
        }

        public Criteria andHPriceEqualTo(Double value) {
            addCriterion("h_price =", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceNotEqualTo(Double value) {
            addCriterion("h_price <>", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceGreaterThan(Double value) {
            addCriterion("h_price >", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("h_price >=", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceLessThan(Double value) {
            addCriterion("h_price <", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceLessThanOrEqualTo(Double value) {
            addCriterion("h_price <=", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceIn(List<Double> values) {
            addCriterion("h_price in", values, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceNotIn(List<Double> values) {
            addCriterion("h_price not in", values, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceBetween(Double value1, Double value2) {
            addCriterion("h_price between", value1, value2, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceNotBetween(Double value1, Double value2) {
            addCriterion("h_price not between", value1, value2, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHInventoryIsNull() {
            addCriterion("h_inventory is null");
            return (Criteria) this;
        }

        public Criteria andHInventoryIsNotNull() {
            addCriterion("h_inventory is not null");
            return (Criteria) this;
        }

        public Criteria andHInventoryEqualTo(Integer value) {
            addCriterion("h_inventory =", value, "hInventory");
            return (Criteria) this;
        }

        public Criteria andHInventoryNotEqualTo(Integer value) {
            addCriterion("h_inventory <>", value, "hInventory");
            return (Criteria) this;
        }

        public Criteria andHInventoryGreaterThan(Integer value) {
            addCriterion("h_inventory >", value, "hInventory");
            return (Criteria) this;
        }

        public Criteria andHInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_inventory >=", value, "hInventory");
            return (Criteria) this;
        }

        public Criteria andHInventoryLessThan(Integer value) {
            addCriterion("h_inventory <", value, "hInventory");
            return (Criteria) this;
        }

        public Criteria andHInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("h_inventory <=", value, "hInventory");
            return (Criteria) this;
        }

        public Criteria andHInventoryIn(List<Integer> values) {
            addCriterion("h_inventory in", values, "hInventory");
            return (Criteria) this;
        }

        public Criteria andHInventoryNotIn(List<Integer> values) {
            addCriterion("h_inventory not in", values, "hInventory");
            return (Criteria) this;
        }

        public Criteria andHInventoryBetween(Integer value1, Integer value2) {
            addCriterion("h_inventory between", value1, value2, "hInventory");
            return (Criteria) this;
        }

        public Criteria andHInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("h_inventory not between", value1, value2, "hInventory");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table heat_dissipation
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
     * This class corresponds to the database table heat_dissipation
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