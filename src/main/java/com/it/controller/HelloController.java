package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者：钟伟
 * 时间：2020/3/19 9:09
 */

@RestController
public class HelloController {

    @RequestMapping("info")
    public String info(){
        return "hello1";
    }

    //开发人员添加
    @RequestMapping("info1")
    public String info1(){
        return "hello2";
    }
}
