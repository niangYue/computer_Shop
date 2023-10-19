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
public class Memory {
    private Integer mId;
    private String mName;
    private String mFactory;
    private String mParam;
    private String mImg;
    private double mPrice;
    private Integer mInventory;
}
