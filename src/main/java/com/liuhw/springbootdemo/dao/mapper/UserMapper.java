package com.liuhw.springbootdemo.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liuhw.springbootdemo.dao.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> queryUserList();

    User queryUserByid(Integer userId);

    void insertUser(User user);
}
