package com.guan.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody //写在最外面表示将这个类的所有返回值直接给浏览器(如果是对象 那么就会转成json数据)
////controller表示这个类可以处理请求
//@Controller
@RestController //可以代替上面那两个注解
public class helloworld {

    //@ResponseBody //将方返回值返回到浏览器页面
    @RequestMapping("/hello") //接受请求
    public String hello() {
        return "Hello Wordl!";
    }
}
