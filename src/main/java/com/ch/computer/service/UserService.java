package com.ch.computer.service;

import com.ch.computer.pojo.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 陈辉
 * @Date: 2023/08/08/16:19
 * @Description:
 * @version: 1.0
 */
public interface UserService {
    User selectUserByNameAndPwd(String name, String password);

    int insertUser(User user);

    List<User> selectUsers();

    User selectUserById(Integer id);

    int updateUserById(User user);

    int deleteUserById(Integer id);

    User selectUserByName(String name);
}
