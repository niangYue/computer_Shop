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
public class Cpu {
    private Integer cId;
    private String cName;
    private String cFactory;
    private String cParam;
    private String cImg;
    private double cPrice;
    private Integer cInventory;
}
