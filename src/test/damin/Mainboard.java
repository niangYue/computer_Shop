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
public class Mainboard {
    private Integer mdId;
    private String mdName;
    private String mdFactory;
    private String mdParam;
    private String mdImg;
    private double mdPrice;
    private Integer mdInventory;
}
