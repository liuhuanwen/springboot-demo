package com.liuhw.springbootdemo.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liuhw.springbootdemo.dao.po.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
