package com.ch.computer.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopCartExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shopcart
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shopcart
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shopcart
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopcart
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public ShopCartExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopcart
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopcart
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopcart
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopcart
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopcart
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopcart
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopcart
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopcart
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
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
     * This method corresponds to the database table shopcart
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopcart
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table shopcart
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
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

        public Criteria andScIdIsNull() {
            addCriterion("sc_id is null");
            return (Criteria) this;
        }

        public Criteria andScIdIsNotNull() {
            addCriterion("sc_id is not null");
            return (Criteria) this;
        }

        public Criteria andScIdEqualTo(Integer value) {
            addCriterion("sc_id =", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotEqualTo(Integer value) {
            addCriterion("sc_id <>", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThan(Integer value) {
            addCriterion("sc_id >", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_id >=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThan(Integer value) {
            addCriterion("sc_id <", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThanOrEqualTo(Integer value) {
            addCriterion("sc_id <=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdIn(List<Integer> values) {
            addCriterion("sc_id in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotIn(List<Integer> values) {
            addCriterion("sc_id not in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdBetween(Integer value1, Integer value2) {
            addCriterion("sc_id between", value1, value2, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_id not between", value1, value2, "scId");
            return (Criteria) this;
        }

        public Criteria andScCrtimeIsNull() {
            addCriterion("sc_crtime is null");
            return (Criteria) this;
        }

        public Criteria andScCrtimeIsNotNull() {
            addCriterion("sc_crtime is not null");
            return (Criteria) this;
        }

        public Criteria andScCrtimeEqualTo(Date value) {
            addCriterion("sc_crtime =", value, "scCrtime");
            return (Criteria) this;
        }

        public Criteria andScCrtimeNotEqualTo(Date value) {
            addCriterion("sc_crtime <>", value, "scCrtime");
            return (Criteria) this;
        }

        public Criteria andScCrtimeGreaterThan(Date value) {
            addCriterion("sc_crtime >", value, "scCrtime");
            return (Criteria) this;
        }

        public Criteria andScCrtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sc_crtime >=", value, "scCrtime");
            return (Criteria) this;
        }

        public Criteria andScCrtimeLessThan(Date value) {
            addCriterion("sc_crtime <", value, "scCrtime");
            return (Criteria) this;
        }

        public Criteria andScCrtimeLessThanOrEqualTo(Date value) {
            addCriterion("sc_crtime <=", value, "scCrtime");
            return (Criteria) this;
        }

        public Criteria andScCrtimeIn(List<Date> values) {
            addCriterion("sc_crtime in", values, "scCrtime");
            return (Criteria) this;
        }

        public Criteria andScCrtimeNotIn(List<Date> values) {
            addCriterion("sc_crtime not in", values, "scCrtime");
            return (Criteria) this;
        }

        public Criteria andScCrtimeBetween(Date value1, Date value2) {
            addCriterion("sc_crtime between", value1, value2, "scCrtime");
            return (Criteria) this;
        }

        public Criteria andScCrtimeNotBetween(Date value1, Date value2) {
            addCriterion("sc_crtime not between", value1, value2, "scCrtime");
            return (Criteria) this;
        }

        public Criteria andScUserIsNull() {
            addCriterion("sc_user is null");
            return (Criteria) this;
        }

        public Criteria andScUserIsNotNull() {
            addCriterion("sc_user is not null");
            return (Criteria) this;
        }

        public Criteria andScUserEqualTo(String value) {
            addCriterion("sc_user =", value, "scUser");
            return (Criteria) this;
        }

        public Criteria andScUserNotEqualTo(String value) {
            addCriterion("sc_user <>", value, "scUser");
            return (Criteria) this;
        }

        public Criteria andScUserGreaterThan(String value) {
            addCriterion("sc_user >", value, "scUser");
            return (Criteria) this;
        }

        public Criteria andScUserGreaterThanOrEqualTo(String value) {
            addCriterion("sc_user >=", value, "scUser");
            return (Criteria) this;
        }

        public Criteria andScUserLessThan(String value) {
            addCriterion("sc_user <", value, "scUser");
            return (Criteria) this;
        }

        public Criteria andScUserLessThanOrEqualTo(String value) {
            addCriterion("sc_user <=", value, "scUser");
            return (Criteria) this;
        }

        public Criteria andScUserLike(String value) {
            addCriterion("sc_user like", value, "scUser");
            return (Criteria) this;
        }

        public Criteria andScUserNotLike(String value) {
            addCriterion("sc_user not like", value, "scUser");
            return (Criteria) this;
        }

        public Criteria andScUserIn(List<String> values) {
            addCriterion("sc_user in", values, "scUser");
            return (Criteria) this;
        }

        public Criteria andScUserNotIn(List<String> values) {
            addCriterion("sc_user not in", values, "scUser");
            return (Criteria) this;
        }

        public Criteria andScUserBetween(String value1, String value2) {
            addCriterion("sc_user between", value1, value2, "scUser");
            return (Criteria) this;
        }

        public Criteria andScUserNotBetween(String value1, String value2) {
            addCriterion("sc_user not between", value1, value2, "scUser");
            return (Criteria) this;
        }

        public Criteria andScCpuIsNull() {
            addCriterion("sc_cpu is null");
            return (Criteria) this;
        }

        public Criteria andScCpuIsNotNull() {
            addCriterion("sc_cpu is not null");
            return (Criteria) this;
        }

        public Criteria andScCpuEqualTo(String value) {
            addCriterion("sc_cpu =", value, "scCpu");
            return (Criteria) this;
        }

        public Criteria andScCpuNotEqualTo(String value) {
            addCriterion("sc_cpu <>", value, "scCpu");
            return (Criteria) this;
        }

        public Criteria andScCpuGreaterThan(String value) {
            addCriterion("sc_cpu >", value, "scCpu");
            return (Criteria) this;
        }

        public Criteria andScCpuGreaterThanOrEqualTo(String value) {
            addCriterion("sc_cpu >=", value, "scCpu");
            return (Criteria) this;
        }

        public Criteria andScCpuLessThan(String value) {
            addCriterion("sc_cpu <", value, "scCpu");
            return (Criteria) this;
        }

        public Criteria andScCpuLessThanOrEqualTo(String value) {
            addCriterion("sc_cpu <=", value, "scCpu");
            return (Criteria) this;
        }

        public Criteria andScCpuLike(String value) {
            addCriterion("sc_cpu like", value, "scCpu");
            return (Criteria) this;
        }

        public Criteria andScCpuNotLike(String value) {
            addCriterion("sc_cpu not like", value, "scCpu");
            return (Criteria) this;
        }

        public Criteria andScCpuIn(List<String> values) {
            addCriterion("sc_cpu in", values, "scCpu");
            return (Criteria) this;
        }

        public Criteria andScCpuNotIn(List<String> values) {
            addCriterion("sc_cpu not in", values, "scCpu");
            return (Criteria) this;
        }

        public Criteria andScCpuBetween(String value1, String value2) {
            addCriterion("sc_cpu between", value1, value2, "scCpu");
            return (Criteria) this;
        }

        public Criteria andScCpuNotBetween(String value1, String value2) {
            addCriterion("sc_cpu not between", value1, value2, "scCpu");
            return (Criteria) this;
        }

        public Criteria andScChassisIsNull() {
            addCriterion("sc_chassis is null");
            return (Criteria) this;
        }

        public Criteria andScChassisIsNotNull() {
            addCriterion("sc_chassis is not null");
            return (Criteria) this;
        }

        public Criteria andScChassisEqualTo(String value) {
            addCriterion("sc_chassis =", value, "scChassis");
            return (Criteria) this;
        }

        public Criteria andScChassisNotEqualTo(String value) {
            addCriterion("sc_chassis <>", value, "scChassis");
            return (Criteria) this;
        }

        public Criteria andScChassisGreaterThan(String value) {
            addCriterion("sc_chassis >", value, "scChassis");
            return (Criteria) this;
        }

        public Criteria andScChassisGreaterThanOrEqualTo(String value) {
            addCriterion("sc_chassis >=", value, "scChassis");
            return (Criteria) this;
        }

        public Criteria andScChassisLessThan(String value) {
            addCriterion("sc_chassis <", value, "scChassis");
            return (Criteria) this;
        }

        public Criteria andScChassisLessThanOrEqualTo(String value) {
            addCriterion("sc_chassis <=", value, "scChassis");
            return (Criteria) this;
        }

        public Criteria andScChassisLike(String value) {
            addCriterion("sc_chassis like", value, "scChassis");
            return (Criteria) this;
        }

        public Criteria andScChassisNotLike(String value) {
            addCriterion("sc_chassis not like", value, "scChassis");
            return (Criteria) this;
        }

        public Criteria andScChassisIn(List<String> values) {
            addCriterion("sc_chassis in", values, "scChassis");
            return (Criteria) this;
        }

        public Criteria andScChassisNotIn(List<String> values) {
            addCriterion("sc_chassis not in", values, "scChassis");
            return (Criteria) this;
        }

        public Criteria andScChassisBetween(String value1, String value2) {
            addCriterion("sc_chassis between", value1, value2, "scChassis");
            return (Criteria) this;
        }

        public Criteria andScChassisNotBetween(String value1, String value2) {
            addCriterion("sc_chassis not between", value1, value2, "scChassis");
            return (Criteria) this;
        }

        public Criteria andScDiskIsNull() {
            addCriterion("sc_disk is null");
            return (Criteria) this;
        }

        public Criteria andScDiskIsNotNull() {
            addCriterion("sc_disk is not null");
            return (Criteria) this;
        }

        public Criteria andScDiskEqualTo(String value) {
            addCriterion("sc_disk =", value, "scDisk");
            return (Criteria) this;
        }

        public Criteria andScDiskNotEqualTo(String value) {
            addCriterion("sc_disk <>", value, "scDisk");
            return (Criteria) this;
        }

        public Criteria andScDiskGreaterThan(String value) {
            addCriterion("sc_disk >", value, "scDisk");
            return (Criteria) this;
        }

        public Criteria andScDiskGreaterThanOrEqualTo(String value) {
            addCriterion("sc_disk >=", value, "scDisk");
            return (Criteria) this;
        }

        public Criteria andScDiskLessThan(String value) {
            addCriterion("sc_disk <", value, "scDisk");
            return (Criteria) this;
        }

        public Criteria andScDiskLessThanOrEqualTo(String value) {
            addCriterion("sc_disk <=", value, "scDisk");
            return (Criteria) this;
        }

        public Criteria andScDiskLike(String value) {
            addCriterion("sc_disk like", value, "scDisk");
            return (Criteria) this;
        }

        public Criteria andScDiskNotLike(String value) {
            addCriterion("sc_disk not like", value, "scDisk");
            return (Criteria) this;
        }

        public Criteria andScDiskIn(List<String> values) {
            addCriterion("sc_disk in", values, "scDisk");
            return (Criteria) this;
        }

        public Criteria andScDiskNotIn(List<String> values) {
            addCriterion("sc_disk not in", values, "scDisk");
            return (Criteria) this;
        }

        public Criteria andScDiskBetween(String value1, String value2) {
            addCriterion("sc_disk between", value1, value2, "scDisk");
            return (Criteria) this;
        }

        public Criteria andScDiskNotBetween(String value1, String value2) {
            addCriterion("sc_disk not between", value1, value2, "scDisk");
            return (Criteria) this;
        }

        public Criteria andScFanIsNull() {
            addCriterion("sc_fan is null");
            return (Criteria) this;
        }

        public Criteria andScFanIsNotNull() {
            addCriterion("sc_fan is not null");
            return (Criteria) this;
        }

        public Criteria andScFanEqualTo(String value) {
            addCriterion("sc_fan =", value, "scFan");
            return (Criteria) this;
        }

        public Criteria andScFanNotEqualTo(String value) {
            addCriterion("sc_fan <>", value, "scFan");
            return (Criteria) this;
        }

        public Criteria andScFanGreaterThan(String value) {
            addCriterion("sc_fan >", value, "scFan");
            return (Criteria) this;
        }

        public Criteria andScFanGreaterThanOrEqualTo(String value) {
            addCriterion("sc_fan >=", value, "scFan");
            return (Criteria) this;
        }

        public Criteria andScFanLessThan(String value) {
            addCriterion("sc_fan <", value, "scFan");
            return (Criteria) this;
        }

        public Criteria andScFanLessThanOrEqualTo(String value) {
            addCriterion("sc_fan <=", value, "scFan");
            return (Criteria) this;
        }

        public Criteria andScFanLike(String value) {
            addCriterion("sc_fan like", value, "scFan");
            return (Criteria) this;
        }

        public Criteria andScFanNotLike(String value) {
            addCriterion("sc_fan not like", value, "scFan");
            return (Criteria) this;
        }

        public Criteria andScFanIn(List<String> values) {
            addCriterion("sc_fan in", values, "scFan");
            return (Criteria) this;
        }

        public Criteria andScFanNotIn(List<String> values) {
            addCriterion("sc_fan not in", values, "scFan");
            return (Criteria) this;
        }

        public Criteria andScFanBetween(String value1, String value2) {
            addCriterion("sc_fan between", value1, value2, "scFan");
            return (Criteria) this;
        }

        public Criteria andScFanNotBetween(String value1, String value2) {
            addCriterion("sc_fan not between", value1, value2, "scFan");
            return (Criteria) this;
        }

        public Criteria andScGraphicsCardIsNull() {
            addCriterion("sc_graphics_card is null");
            return (Criteria) this;
        }

        public Criteria andScGraphicsCardIsNotNull() {
            addCriterion("sc_graphics_card is not null");
            return (Criteria) this;
        }

        public Criteria andScGraphicsCardEqualTo(String value) {
            addCriterion("sc_graphics_card =", value, "scGraphicsCard");
            return (Criteria) this;
        }

        public Criteria andScGraphicsCardNotEqualTo(String value) {
            addCriterion("sc_graphics_card <>", value, "scGraphicsCard");
            return (Criteria) this;
        }

        public Criteria andScGraphicsCardGreaterThan(String value) {
            addCriterion("sc_graphics_card >", value, "scGraphicsCard");
            return (Criteria) this;
        }

        public Criteria andScGraphicsCardGreaterThanOrEqualTo(String value) {
            addCriterion("sc_graphics_card >=", value, "scGraphicsCard");
            return (Criteria) this;
        }

        public Criteria andScGraphicsCardLessThan(String value) {
            addCriterion("sc_graphics_card <", value, "scGraphicsCard");
            return (Criteria) this;
        }

        public Criteria andScGraphicsCardLessThanOrEqualTo(String value) {
            addCriterion("sc_graphics_card <=", value, "scGraphicsCard");
            return (Criteria) this;
        }

        public Criteria andScGraphicsCardLike(String value) {
            addCriterion("sc_graphics_card like", value, "scGraphicsCard");
            return (Criteria) this;
        }

        public Criteria andScGraphicsCardNotLike(String value) {
            addCriterion("sc_graphics_card not like", value, "scGraphicsCard");
            return (Criteria) this;
        }

        public Criteria andScGraphicsCardIn(List<String> values) {
            addCriterion("sc_graphics_card in", values, "scGraphicsCard");
            return (Criteria) this;
        }

        public Criteria andScGraphicsCardNotIn(List<String> values) {
            addCriterion("sc_graphics_card not in", values, "scGraphicsCard");
            return (Criteria) this;
        }

        public Criteria andScGraphicsCardBetween(String value1, String value2) {
            addCriterion("sc_graphics_card between", value1, value2, "scGraphicsCard");
            return (Criteria) this;
        }

        public Criteria andScGraphicsCardNotBetween(String value1, String value2) {
            addCriterion("sc_graphics_card not between", value1, value2, "scGraphicsCard");
            return (Criteria) this;
        }

        public Criteria andScHeatDissipationIsNull() {
            addCriterion("sc_heat_dissipation is null");
            return (Criteria) this;
        }

        public Criteria andScHeatDissipationIsNotNull() {
            addCriterion("sc_heat_dissipation is not null");
            return (Criteria) this;
        }

        public Criteria andScHeatDissipationEqualTo(String value) {
            addCriterion("sc_heat_dissipation =", value, "scHeatDissipation");
            return (Criteria) this;
        }

        public Criteria andScHeatDissipationNotEqualTo(String value) {
            addCriterion("sc_heat_dissipation <>", value, "scHeatDissipation");
            return (Criteria) this;
        }

        public Criteria andScHeatDissipationGreaterThan(String value) {
            addCriterion("sc_heat_dissipation >", value, "scHeatDissipation");
            return (Criteria) this;
        }

        public Criteria andScHeatDissipationGreaterThanOrEqualTo(String value) {
            addCriterion("sc_heat_dissipation >=", value, "scHeatDissipation");
            return (Criteria) this;
        }

        public Criteria andScHeatDissipationLessThan(String value) {
            addCriterion("sc_heat_dissipation <", value, "scHeatDissipation");
            return (Criteria) this;
        }

        public Criteria andScHeatDissipationLessThanOrEqualTo(String value) {
            addCriterion("sc_heat_dissipation <=", value, "scHeatDissipation");
            return (Criteria) this;
        }

        public Criteria andScHeatDissipationLike(String value) {
            addCriterion("sc_heat_dissipation like", value, "scHeatDissipation");
            return (Criteria) this;
        }

        public Criteria andScHeatDissipationNotLike(String value) {
            addCriterion("sc_heat_dissipation not like", value, "scHeatDissipation");
            return (Criteria) this;
        }

        public Criteria andScHeatDissipationIn(List<String> values) {
            addCriterion("sc_heat_dissipation in", values, "scHeatDissipation");
            return (Criteria) this;
        }

        public Criteria andScHeatDissipationNotIn(List<String> values) {
            addCriterion("sc_heat_dissipation not in", values, "scHeatDissipation");
            return (Criteria) this;
        }

        public Criteria andScHeatDissipationBetween(String value1, String value2) {
            addCriterion("sc_heat_dissipation between", value1, value2, "scHeatDissipation");
            return (Criteria) this;
        }

        public Criteria andScHeatDissipationNotBetween(String value1, String value2) {
            addCriterion("sc_heat_dissipation not between", value1, value2, "scHeatDissipation");
            return (Criteria) this;
        }

        public Criteria andScMainboardIsNull() {
            addCriterion("sc_mainboard is null");
            return (Criteria) this;
        }

        public Criteria andScMainboardIsNotNull() {
            addCriterion("sc_mainboard is not null");
            return (Criteria) this;
        }

        public Criteria andScMainboardEqualTo(String value) {
            addCriterion("sc_mainboard =", value, "scMainboard");
            return (Criteria) this;
        }

        public Criteria andScMainboardNotEqualTo(String value) {
            addCriterion("sc_mainboard <>", value, "scMainboard");
            return (Criteria) this;
        }

        public Criteria andScMainboardGreaterThan(String value) {
            addCriterion("sc_mainboard >", value, "scMainboard");
            return (Criteria) this;
        }

        public Criteria andScMainboardGreaterThanOrEqualTo(String value) {
            addCriterion("sc_mainboard >=", value, "scMainboard");
            return (Criteria) this;
        }

        public Criteria andScMainboardLessThan(String value) {
            addCriterion("sc_mainboard <", value, "scMainboard");
            return (Criteria) this;
        }

        public Criteria andScMainboardLessThanOrEqualTo(String value) {
            addCriterion("sc_mainboard <=", value, "scMainboard");
            return (Criteria) this;
        }

        public Criteria andScMainboardLike(String value) {
            addCriterion("sc_mainboard like", value, "scMainboard");
            return (Criteria) this;
        }

        public Criteria andScMainboardNotLike(String value) {
            addCriterion("sc_mainboard not like", value, "scMainboard");
            return (Criteria) this;
        }

        public Criteria andScMainboardIn(List<String> values) {
            addCriterion("sc_mainboard in", values, "scMainboard");
            return (Criteria) this;
        }

        public Criteria andScMainboardNotIn(List<String> values) {
            addCriterion("sc_mainboard not in", values, "scMainboard");
            return (Criteria) this;
        }

        public Criteria andScMainboardBetween(String value1, String value2) {
            addCriterion("sc_mainboard between", value1, value2, "scMainboard");
            return (Criteria) this;
        }

        public Criteria andScMainboardNotBetween(String value1, String value2) {
            addCriterion("sc_mainboard not between", value1, value2, "scMainboard");
            return (Criteria) this;
        }

        public Criteria andScMemoryIsNull() {
            addCriterion("sc_memory is null");
            return (Criteria) this;
        }

        public Criteria andScMemoryIsNotNull() {
            addCriterion("sc_memory is not null");
            return (Criteria) this;
        }

        public Criteria andScMemoryEqualTo(String value) {
            addCriterion("sc_memory =", value, "scMemory");
            return (Criteria) this;
        }

        public Criteria andScMemoryNotEqualTo(String value) {
            addCriterion("sc_memory <>", value, "scMemory");
            return (Criteria) this;
        }

        public Criteria andScMemoryGreaterThan(String value) {
            addCriterion("sc_memory >", value, "scMemory");
            return (Criteria) this;
        }

        public Criteria andScMemoryGreaterThanOrEqualTo(String value) {
            addCriterion("sc_memory >=", value, "scMemory");
            return (Criteria) this;
        }

        public Criteria andScMemoryLessThan(String value) {
            addCriterion("sc_memory <", value, "scMemory");
            return (Criteria) this;
        }

        public Criteria andScMemoryLessThanOrEqualTo(String value) {
            addCriterion("sc_memory <=", value, "scMemory");
            return (Criteria) this;
        }

        public Criteria andScMemoryLike(String value) {
            addCriterion("sc_memory like", value, "scMemory");
            return (Criteria) this;
        }

        public Criteria andScMemoryNotLike(String value) {
            addCriterion("sc_memory not like", value, "scMemory");
            return (Criteria) this;
        }

        public Criteria andScMemoryIn(List<String> values) {
            addCriterion("sc_memory in", values, "scMemory");
            return (Criteria) this;
        }

        public Criteria andScMemoryNotIn(List<String> values) {
            addCriterion("sc_memory not in", values, "scMemory");
            return (Criteria) this;
        }

        public Criteria andScMemoryBetween(String value1, String value2) {
            addCriterion("sc_memory between", value1, value2, "scMemory");
            return (Criteria) this;
        }

        public Criteria andScMemoryNotBetween(String value1, String value2) {
            addCriterion("sc_memory not between", value1, value2, "scMemory");
            return (Criteria) this;
        }

        public Criteria andScSourceIsNull() {
            addCriterion("sc_source is null");
            return (Criteria) this;
        }

        public Criteria andScSourceIsNotNull() {
            addCriterion("sc_source is not null");
            return (Criteria) this;
        }

        public Criteria andScSourceEqualTo(String value) {
            addCriterion("sc_source =", value, "scSource");
            return (Criteria) this;
        }

        public Criteria andScSourceNotEqualTo(String value) {
            addCriterion("sc_source <>", value, "scSource");
            return (Criteria) this;
        }

        public Criteria andScSourceGreaterThan(String value) {
            addCriterion("sc_source >", value, "scSource");
            return (Criteria) this;
        }

        public Criteria andScSourceGreaterThanOrEqualTo(String value) {
            addCriterion("sc_source >=", value, "scSource");
            return (Criteria) this;
        }

        public Criteria andScSourceLessThan(String value) {
            addCriterion("sc_source <", value, "scSource");
            return (Criteria) this;
        }

        public Criteria andScSourceLessThanOrEqualTo(String value) {
            addCriterion("sc_source <=", value, "scSource");
            return (Criteria) this;
        }

        public Criteria andScSourceLike(String value) {
            addCriterion("sc_source like", value, "scSource");
            return (Criteria) this;
        }

        public Criteria andScSourceNotLike(String value) {
            addCriterion("sc_source not like", value, "scSource");
            return (Criteria) this;
        }

        public Criteria andScSourceIn(List<String> values) {
            addCriterion("sc_source in", values, "scSource");
            return (Criteria) this;
        }

        public Criteria andScSourceNotIn(List<String> values) {
            addCriterion("sc_source not in", values, "scSource");
            return (Criteria) this;
        }

        public Criteria andScSourceBetween(String value1, String value2) {
            addCriterion("sc_source between", value1, value2, "scSource");
            return (Criteria) this;
        }

        public Criteria andScSourceNotBetween(String value1, String value2) {
            addCriterion("sc_source not between", value1, value2, "scSource");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table shopcart
     *
     * @mbggenerated do_not_delete_during_merge Fri Aug 11 22:26:09 CST 2023
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table shopcart
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
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