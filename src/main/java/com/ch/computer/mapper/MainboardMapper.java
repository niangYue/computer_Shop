package com.ch.computer.mapper;

import com.ch.computer.pojo.Mainboard;
import com.ch.computer.pojo.MainboardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MainboardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mainboard
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int countByExample(MainboardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mainboard
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int deleteByExample(MainboardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mainboard
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int deleteByPrimaryKey(Integer mbId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mainboard
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int insert(Mainboard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mainboard
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int insertSelective(Mainboard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mainboard
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    List<Mainboard> selectByExampleWithBLOBs(MainboardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mainboard
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    List<Mainboard> selectByExample(MainboardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mainboard
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    Mainboard selectByPrimaryKey(Integer mbId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mainboard
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int updateByExampleSelective(@Param("record") Mainboard record, @Param("example") MainboardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mainboard
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int updateByExampleWithBLOBs(@Param("record") Mainboard record, @Param("example") MainboardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mainboard
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int updateByExample(@Param("record") Mainboard record, @Param("example") MainboardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mainboard
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int updateByPrimaryKeySelective(Mainboard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mainboard
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(Mainboard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mainboard
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int updateByPrimaryKey(Mainboard record);
}