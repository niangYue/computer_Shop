package com.ch.computer.service.impl;

import com.ch.computer.mapper.GraphicsCardMapper;
import com.ch.computer.pojo.GraphicsCard;
import com.ch.computer.service.GraphicsCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 陈辉
 * @Date: 2023/08/07/23:04
 * @Description:
 * @version: 1.0
 */
@Service
public class GraphicsCardServiceImpl implements GraphicsCardService {

    @Autowired
    private GraphicsCardMapper graphicsCardMapper;

    public GraphicsCard selectGraphicsCardById(int id){
        return graphicsCardMapper.selectByPrimaryKey(id);
    }

    public List<GraphicsCard> selectGraphicsCards() {
        return graphicsCardMapper.selectByExample(null);
    }
}
