package com.ch.computer.controller;

import com.ch.computer.pojo.ShopCart;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 陈辉
 * @Date: 2023/08/11/21:46
 * @Description:
 * @version: 1.0
 */
@Controller
@RequestMapping("/shopCart")
public class ShopCartController {

    @Autowired
    Jedis jedis;

    @RequestMapping("/add")
    public String addShopCart(ShopCart shopCart){

        return "redirect:/index/";
    }


}
