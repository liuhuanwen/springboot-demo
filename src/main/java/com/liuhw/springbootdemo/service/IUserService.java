package com.liuhw.springbootdemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liuhw.springbootdemo.dao.po.User;

import java.util.List;

public interface IUserService extends IService<User> {

    List<User> listAllUsers(Integer pageSize, Integer pageNum);
    
    User queryUserById(Integer userId);

    void addUser(User user);

    void delUser(int userId);

    void updateuser(User user);
}
