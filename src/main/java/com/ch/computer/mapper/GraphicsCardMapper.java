package com.ch.computer.mapper;

import com.ch.computer.pojo.GraphicsCard;
import com.ch.computer.pojo.GraphicsCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GraphicsCardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graphics_card
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int countByExample(GraphicsCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graphics_card
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int deleteByExample(GraphicsCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graphics_card
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int deleteByPrimaryKey(Integer gcId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graphics_card
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int insert(GraphicsCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graphics_card
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int insertSelective(GraphicsCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graphics_card
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    List<GraphicsCard> selectByExampleWithBLOBs(GraphicsCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graphics_card
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    List<GraphicsCard> selectByExample(GraphicsCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graphics_card
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    GraphicsCard selectByPrimaryKey(Integer gcId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graphics_card
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int updateByExampleSelective(@Param("record") GraphicsCard record, @Param("example") GraphicsCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graphics_card
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int updateByExampleWithBLOBs(@Param("record") GraphicsCard record, @Param("example") GraphicsCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graphics_card
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int updateByExample(@Param("record") GraphicsCard record, @Param("example") GraphicsCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graphics_card
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int updateByPrimaryKeySelective(GraphicsCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graphics_card
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(GraphicsCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graphics_card
     *
     * @mbggenerated Mon Aug 07 22:26:32 CST 2023
     */
    int updateByPrimaryKey(GraphicsCard record);
}