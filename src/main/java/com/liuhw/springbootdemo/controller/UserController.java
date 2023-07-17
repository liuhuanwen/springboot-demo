package com.liuhw.springbootdemo.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liuhw.springbootdemo.dao.po.User;
import com.liuhw.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("list")
    List<User> getAllUsers(@RequestParam(defaultValue = "10") Integer pageSize,
                           @RequestParam(defaultValue = "1") Integer pageNum) {
        return userService.listAllUsers(pageSize, pageNum);
    }

    @GetMapping("getUserInfo")
    User getUserInfo(Integer userId) {
        return userService.queryUserById(userId);
    }

    @PostMapping("getUserInfoPost")
    User getUserInfoByPost(Integer userId) {
        return userService.queryUserById(userId);
    }

    @PostMapping("addUser")
    void addUser(String name, Integer age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        userService.addUser(user);
    }

    @PostMapping("delUser")
    void delUser(Integer userId) {
        userService.delUser(userId);
    }

    @PostMapping("updateUser")
    void updateUser(User user) {
        userService.updateuser(user);
    }
}
