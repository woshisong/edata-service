package com.enn.cn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.enn.cn.service.TestService;

/**
 * @Author:ZhangPan
 * @Date:2017/11/28 11:10
 * @Version:1.0v
 * @Description:
 */
@RestController
@RequestMapping("/test")
public class Test {
    @Autowired
    TestService testService;
    @RequestMapping
    public  String selectXa(){

        try {
          //  testService.selectXa();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("0000000000000");
        //http://localhost:9090/test
        return "edata";
    }
}
