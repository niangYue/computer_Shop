package com.ch.computer.pojo;

import java.util.Date;

public class ShopCart {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcart.sc_id
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    private Integer scId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcart.sc_crtime
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    private Date scCrtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcart.sc_user
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    private String scUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcart.sc_cpu
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    private String scCpu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcart.sc_chassis
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    private String scChassis;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcart.sc_disk
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    private String scDisk;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcart.sc_fan
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    private String scFan;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcart.sc_graphics_card
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    private String scGraphicsCard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcart.sc_heat_dissipation
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    private String scHeatDissipation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcart.sc_mainboard
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    private String scMainboard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcart.sc_memory
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    private String scMemory;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcart.sc_source
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    private String scSource;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcart.sc_id
     *
     * @return the value of shopcart.sc_id
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public Integer getScId() {
        return scId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcart.sc_id
     *
     * @param scId the value for shopcart.sc_id
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public void setScId(Integer scId) {
        this.scId = scId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcart.sc_crtime
     *
     * @return the value of shopcart.sc_crtime
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public Date getScCrtime() {
        return scCrtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcart.sc_crtime
     *
     * @param scCrtime the value for shopcart.sc_crtime
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public void setScCrtime(Date scCrtime) {
        this.scCrtime = scCrtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcart.sc_user
     *
     * @return the value of shopcart.sc_user
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public String getScUser() {
        return scUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcart.sc_user
     *
     * @param scUser the value for shopcart.sc_user
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public void setScUser(String scUser) {
        this.scUser = scUser == null ? null : scUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcart.sc_cpu
     *
     * @return the value of shopcart.sc_cpu
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public String getScCpu() {
        return scCpu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcart.sc_cpu
     *
     * @param scCpu the value for shopcart.sc_cpu
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public void setScCpu(String scCpu) {
        this.scCpu = scCpu == null ? null : scCpu.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcart.sc_chassis
     *
     * @return the value of shopcart.sc_chassis
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public String getScChassis() {
        return scChassis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcart.sc_chassis
     *
     * @param scChassis the value for shopcart.sc_chassis
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public void setScChassis(String scChassis) {
        this.scChassis = scChassis == null ? null : scChassis.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcart.sc_disk
     *
     * @return the value of shopcart.sc_disk
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public String getScDisk() {
        return scDisk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcart.sc_disk
     *
     * @param scDisk the value for shopcart.sc_disk
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public void setScDisk(String scDisk) {
        this.scDisk = scDisk == null ? null : scDisk.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcart.sc_fan
     *
     * @return the value of shopcart.sc_fan
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public String getScFan() {
        return scFan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcart.sc_fan
     *
     * @param scFan the value for shopcart.sc_fan
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public void setScFan(String scFan) {
        this.scFan = scFan == null ? null : scFan.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcart.sc_graphics_card
     *
     * @return the value of shopcart.sc_graphics_card
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public String getScGraphicsCard() {
        return scGraphicsCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcart.sc_graphics_card
     *
     * @param scGraphicsCard the value for shopcart.sc_graphics_card
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public void setScGraphicsCard(String scGraphicsCard) {
        this.scGraphicsCard = scGraphicsCard == null ? null : scGraphicsCard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcart.sc_heat_dissipation
     *
     * @return the value of shopcart.sc_heat_dissipation
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public String getScHeatDissipation() {
        return scHeatDissipation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcart.sc_heat_dissipation
     *
     * @param scHeatDissipation the value for shopcart.sc_heat_dissipation
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public void setScHeatDissipation(String scHeatDissipation) {
        this.scHeatDissipation = scHeatDissipation == null ? null : scHeatDissipation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcart.sc_mainboard
     *
     * @return the value of shopcart.sc_mainboard
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public String getScMainboard() {
        return scMainboard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcart.sc_mainboard
     *
     * @param scMainboard the value for shopcart.sc_mainboard
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public void setScMainboard(String scMainboard) {
        this.scMainboard = scMainboard == null ? null : scMainboard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcart.sc_memory
     *
     * @return the value of shopcart.sc_memory
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public String getScMemory() {
        return scMemory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcart.sc_memory
     *
     * @param scMemory the value for shopcart.sc_memory
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public void setScMemory(String scMemory) {
        this.scMemory = scMemory == null ? null : scMemory.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcart.sc_source
     *
     * @return the value of shopcart.sc_source
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public String getScSource() {
        return scSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcart.sc_source
     *
     * @param scSource the value for shopcart.sc_source
     *
     * @mbggenerated Fri Aug 11 22:26:09 CST 2023
     */
    public void setScSource(String scSource) {
        this.scSource = scSource == null ? null : scSource.trim();
    }
}