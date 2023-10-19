package com.ch.computer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 陈辉
 * @Date: 2023/08/07/20:58
 * @Description:
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GraphicsCard {
    private Integer gcId;
    private String gcName;
    private String gcFactory;
    private String gcParam;
    private String gcImg;
    private double gcPrice;
    private Integer gcInventory;
}
