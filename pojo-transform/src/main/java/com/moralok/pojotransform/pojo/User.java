package com.moralok.pojotransform.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;

@Data
@ExcelTarget("user")
public class User {

    @Excel(name = "userId")
    private Long userId;

    @Excel(name = "name")
    private String name;

    @Excel(name = "age")
    private Integer age;
}
