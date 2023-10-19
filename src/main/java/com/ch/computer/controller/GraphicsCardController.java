package com.ch.computer.controller;

import com.ch.computer.pojo.GraphicsCard;
import com.ch.computer.service.impl.GraphicsCardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 陈辉
 * @Date: 2023/08/07/23:18
 * @Description:
 * @version: 1.0
 */
@Controller
public class GraphicsCardController {

    @Autowired
    private GraphicsCardServiceImpl graphicsCardService;

    @RequestMapping("/index")
    public String getCard(Model model){
        GraphicsCard graphicsCard = graphicsCardService.selectGraphicsCardById(1);
        model.addAttribute("graphicsCard", graphicsCard);
        return "a";
    }
}

