package com.moralok.pojotransform.controller;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.alibaba.fastjson.JSONObject;
import com.moralok.pojotransform.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pojoTransform")
public class PojoTransformController {

    @GetMapping("/byFastJson")
    public User transformByFastJson() {
        String jsonStr = "{'userId': 2000, 'name': '张三', 'age': 28}";
        User user = JSONObject.parseObject(jsonStr, User.class);
        return user;
    }

    @GetMapping("/byEasyPoi")
    public List<User> transformByEasyPoi() {
        ImportParams params = new ImportParams();
        params.setTitleRows(0);
        List<User> userList = new ArrayList<>();
        try {
            userList = ExcelImportUtil.importExcel(
                    new File("/Users/zl/Documents/Personal/Java/SpringBoot/demo/pojo-transform/src/main/resources/excel/userList.xlsx"),
                    User.class,
                    params);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }
}
