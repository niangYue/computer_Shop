package com.ch.computer.mapper;

import com.ch.computer.pojo.HeatDissipation;
import com.ch.computer.pojo.HeatDissipationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HeatDissipationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table heat_dissipation
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int countByExample(HeatDissipationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table heat_dissipation
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int deleteByExample(HeatDissipationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table heat_dissipation
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int deleteByPrimaryKey(Integer hId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table heat_dissipation
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int insert(HeatDissipation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table heat_dissipation
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int insertSelective(HeatDissipation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table heat_dissipation
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    List<HeatDissipation> selectByExampleWithBLOBs(HeatDissipationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table heat_dissipation
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    List<HeatDissipation> selectByExample(HeatDissipationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table heat_dissipation
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    HeatDissipation selectByPrimaryKey(Integer hId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table heat_dissipation
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int updateByExampleSelective(@Param("record") HeatDissipation record, @Param("example") HeatDissipationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table heat_dissipation
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int updateByExampleWithBLOBs(@Param("record") HeatDissipation record, @Param("example") HeatDissipationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table heat_dissipation
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int updateByExample(@Param("record") HeatDissipation record, @Param("example") HeatDissipationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table heat_dissipation
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int updateByPrimaryKeySelective(HeatDissipation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table heat_dissipation
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(HeatDissipation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table heat_dissipation
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int updateByPrimaryKey(HeatDissipation record);
}