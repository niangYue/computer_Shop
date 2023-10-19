package com.ch.computer.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 陈辉
 * @Date: 2023/08/10/2:17
 * @Description:
 * @version: 1.0
 */
public class test1 {

//    @Autowired
//    RedisTemplate redisTemplate;

    @Test
    public void test1(){
        System.out.println("sdsajflkjf".matches("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$"));
    }

    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("redis-appectionContext.xml");
        RedisTemplate redisTemplate = (RedisTemplate) applicationContext.getBean("redisTemplate");
        redisTemplate.opsForValue().set("a","jj");
        System.out.println(redisTemplate.opsForValue().get("a"));
    }
}
