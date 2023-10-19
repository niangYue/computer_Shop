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
public class Chassis {
    private Integer chId;
    private String chName;
    private String chFactory;
    private String chParam;
    private String chImg;
    private double chPrice;
    private Integer chInventory;
}
