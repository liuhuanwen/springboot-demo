package com.liuhw.springbootdemo.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liuhw.springbootdemo.dao.mapper.UserMapper;
import com.liuhw.springbootdemo.dao.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listAllUsers() {
        LambdaQueryWrapper<User> queryWrapper =new LambdaQueryWrapper<>();
        queryWrapper.gt(User::getAge, 18);
        Page<User> page = new Page<>(2, 10);
        page = userMapper.selectPage(page, queryWrapper);
        return page.getRecords();
    }

    @Override
    public User queryUserById(Integer userId) {
        LambdaQueryWrapper<User> queryWrapper =new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getId, userId);
        return userMapper.selectOne(queryWrapper);
    }

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void delUser(int userId) {
        userMapper.deleteById(userId);

    }

    @Override
    public void updateuser(User user) {
        userMapper.updateById(user);
    }
}
