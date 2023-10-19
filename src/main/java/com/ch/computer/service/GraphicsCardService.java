package com.ch.computer.service;

import com.ch.computer.pojo.GraphicsCard;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 陈辉
 * @Date: 2023/08/08/16:18
 * @Description:
 * @version: 1.0
 */
public interface GraphicsCardService {

    GraphicsCard selectGraphicsCardById(int id);

    List<GraphicsCard> selectGraphicsCards();
}
