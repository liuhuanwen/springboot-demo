package com.liuhw.springbootdemo.controller;


import com.liuhw.springbootdemo.dao.po.User;
import com.liuhw.springbootdemo.dto.UserDTO;
import com.liuhw.springbootdemo.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("user")
@RestController
@Validated
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
    void addUser(@RequestBody @Valid UserDTO userDTO) {
        userService.addUser(userDTO);
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
