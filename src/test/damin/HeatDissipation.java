package com.ch.computer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 陈辉
 * @Date: 2023/08/07/20:59
 * @Description:
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HeatDissipation {
    private Integer hId;
    private String hName;
    private String hFactory;
    private String hParam;
    private Integer hType;
    private String hImg;
    private double hPrice;
    private Integer hInventory;
}
