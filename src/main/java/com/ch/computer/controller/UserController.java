package com.ch.computer.controller;

import com.alibaba.fastjson.JSON;
import com.ch.computer.pojo.User;
import com.ch.computer.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 陈辉
 * @Date: 2023/08/08/16:20
 * @Description:
 * @version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @Autowired
    Jedis jedis;

    @GetMapping("/login")
    public String userLogin(User user, Model model, HttpServletRequest request){
        User userLogin = userService.selectUserByNameAndPwd(user.getName(),user.getPassword());
//        String header = request.getContextPath();
//        System.out.println(header);
        if (userLogin == null){
            //登录失败
            model.addAttribute("userLog","用户名或密码错误");
            //获取请求头中的信息，实现哪里请求，回到哪里去
            return "login";
        }
        //登录成功，跳转到首页
        request.getSession().setAttribute("logUser",userLogin);
        return "redirect:/index/";
    }

    @PostMapping("/register")
    public String UserRegister(User user,
                               @RequestParam("pwd") String pwd,
                               Model model, HttpServletRequest request){
        //判断用户信息的合法性
        if (!(user.getName().matches("^[a-zA-Z][a-zA-Z0-9_]{4,15}$") && //字母开头，允许5-16字节，允许字母数字下划线)
                user.getPassword().matches("^[a-zA-Z]\\w{5,17}$") && //(以字母开头，长度在6~18之间，只能包含字母、数字和下划线
                user.getPassword().equals(pwd) &&
                user.getPhone().matches("^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$") &&
                user.getEmail().matches("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$")
        )){
            model.addAttribute("userReg","您的注册信息不合理，请重新输入");
            return "register";
        }
        int isok = userService.insertUser(user);
        if (isok > 0){
            //将数据保存到redis
            jedis.set(user.getName(),JSON.toJSONString(user));
            //跳转到登录页面
            return "login";
        }else {
            //注册失败，返回信息
            model.addAttribute("userReg","您输入的信息不符合规则，请重新输入");
            //拿来的回哪去
            return "register";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request){
        request.getSession().removeAttribute("logUser");
        return "redirect:/index/";
    }


    @RequestMapping("/userManage")
    public String userManage(HttpServletRequest request,Model model){
        User logUser = (User) request.getSession().getAttribute("logUser");
        if (logUser.getUserType() == 0){
            model.addAttribute("userAuthority","你的权限不足，请切换到管理员用户");
            return "forward:/index/";
        }
        List<User> users = userService.selectUsers();
        model.addAttribute("users",users);
        return "userManage";
    }

    @RequestMapping("/selectUserById")
    public String selectUserById(Integer id,Model model){
        User user = new User();
        if (id == null){
            return "forward:/user/userManage";
        }
        String s = jedis.get(id + "");
        if (s != null){
            user = JSON.parseObject(s, User.class);
        }else {
            user = userService.selectUserById(id);
        }
        if (user == null){
            return "forward:/user/userManage";
        }
        model.addAttribute("userUpd",user);
        return "userUpdate";
    }

    @RequestMapping("/selectUserByName")
    public String selectUserByName(String name,Model model){
        if (name == null){
            return "forward:/user/userManage";
        }
        User user = new User();
        String s = jedis.get(name);
        if (s != null){
            user = JSON.parseObject(s, User.class);
        }else {
            user = userService.selectUserByName(name);
        }
        if (user == null){
            return "forward:/user/userManage";
        }
        model.addAttribute("userUpd",user);
        return "userUpdate";
    }

    @PostMapping("/userUpdateById")
    public String UserUpdateById(User user,Model model,HttpServletRequest request){
        if (!(user.getName().matches("^[a-zA-Z][a-zA-Z0-9_]{4,15}$") && //字母开头，允许5-16字节，允许字母数字下划线)
                user.getPassword().matches("^[a-zA-Z]\\w{5,17}$") && //(以字母开头，长度在6~18之间，只能包含字母、数字和下划线
                user.getPhone().matches("^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$") &&
                user.getEmail().matches("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$")
        )){
            model.addAttribute("user","您的输入信息不合理，请重新输入");
            return "forward:/user/selectUserById?id=" + user.getId();
        }
        int isok = userService.updateUserById(user);
        if (! (isok > 0)){
            model.addAttribute("user","修改失败");
            return "forward:/user/selectUserById?id=" + user.getId();
        }
        return "forward:/user/userManage";
    }

    @DeleteMapping("/deleteUserById")
    public String deleteUserById(Integer id){
        int isok = userService.deleteUserById(id);
        return "forward:/user/userManage";
    }

}
