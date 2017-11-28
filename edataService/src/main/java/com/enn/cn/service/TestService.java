package com.enn.cn.service;

import com.enn.cn.mapper.TestMapper;
import com.enn.cn.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:ZhangPan
 * @Date:2017/11/28 11:12
 * @Version:1.0v
 * @Description:
 */
@Service
public class TestService {
    @Autowired
    TestMapper testMapper;


    public List<Test> selectXa(){

        return  testMapper.selectXa();
    }
}

