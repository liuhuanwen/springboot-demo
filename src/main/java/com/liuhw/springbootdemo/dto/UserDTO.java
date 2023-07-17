package com.liuhw.springbootdemo.dto;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Data
public class UserDTO {

    @NotNull(message = "name不能为空")
    private String name;

    @NotNull(message = "age不能为空")
    @Max(message = "age不能大于200", value = 200)
    private Integer age;

}
