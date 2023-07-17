package com.liuhw.springbootdemo.service;

import com.liuhw.springbootdemo.dao.mapper.UserMapper;
import com.liuhw.springbootdemo.dao.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> listAllUsers() {
        return userMapper.queryUserList();
    }

    public User queryUserById(Integer userId) {
        return userMapper.queryUserByid(userId);
    }
}
