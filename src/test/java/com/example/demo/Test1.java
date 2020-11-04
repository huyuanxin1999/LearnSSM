package com.example.demo;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest //不加上会无法创建bean
@DisplayName("测试1")
public class Test1{
    @Test
    public void Test(){
        System.out.print("TEST1");
    }
}
