package com.liuhw.springbootdemo.controller;


import com.liuhw.springbootdemo.dao.po.User;
import com.liuhw.springbootdemo.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("list")
    List<User> getAllUsers() {
        return userService.listAllUsers();
    }

    @GetMapping("getUserInfo")
    User getUserInfo(@Param("userId") Integer userId) {
        return userService.queryUserById(userId);
    }

    @PostMapping("getUserInfoPost")
    User getUserInfoByPost(Integer userId) {
        return userService.queryUserById(userId);
    }
}
