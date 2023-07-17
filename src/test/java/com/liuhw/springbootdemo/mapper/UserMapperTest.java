package com.liuhw.springbootdemo.mapper;

import com.liuhw.springbootdemo.dao.mapper.UserMapper;
import com.liuhw.springbootdemo.dao.po.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setName("liuhuanwen");
        user.setAge(34);
        userMapper.insert(user);
    }
}
