package com.ch.computer.service.impl;

import com.ch.computer.mapper.UserMapper;
import com.ch.computer.pojo.User;
import com.ch.computer.pojo.UserExample;
import com.ch.computer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 陈辉
 * @Date: 2023/08/08/16:20
 * @Description:
 * @version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectUserByNameAndPwd(String name, String password) {
        if (name == null || password == null){
            return null;
        }
        UserExample example = new UserExample();
        example.createCriteria().andNameEqualTo(name).andPasswordEqualTo(password);
        List<User> users = userMapper.selectByExample(example);
        if (users.size() > 0){
            for (User user : users) {
                if (user != null) {
                    return user;
                }
            }
        }
            return null;
    }

    public int insertUser(User user) {
        if (user == null){
            return 0;
        }
        user.setRegisterTime(new Date());
        user.setUserType(0);
        int insert = userMapper.insert(user);
        return insert;
    }

    public List<User> selectUsers() {
        List<User> users = userMapper.selectByExample(null);
        return users;
    }

    public User selectUserById(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    public int updateUserById(User user) {
        int i = userMapper.updateByPrimaryKey(user);

        return i;
    }

    public User selectUserByName(String name) {
        UserExample example = new UserExample();
        example.createCriteria().andNameEqualTo(name);
        List<User> users = userMapper.selectByExample(example);
        return users.get(0);
    }

    public int deleteUserById(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }
}
