package com.guan.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//初始化一个SpringBoot应用，已经将web的相关依赖包含进来
//可以点进去看SpringBootApplication这个注解
@SpringBootApplication
public class HelloworldApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloworldApplication.class, args);
    }

}
