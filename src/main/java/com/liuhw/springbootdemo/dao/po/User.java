package com.liuhw.springbootdemo.dao.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@TableName("user")
@Data
public class User implements Serializable {

    private Integer id;

    private String name;

    private Integer age;
}
