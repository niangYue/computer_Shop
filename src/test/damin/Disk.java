package com.ch.computer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 陈辉
 * @Date: 2023/08/07/20:57
 * @Description:
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Disk {
    private Integer dId;
    private String dName;
    private String dFactory;
    private String dParam;
    private String dImg;
    private Integer dType;
    private double dPrice;
    private Integer dInventory;
}
