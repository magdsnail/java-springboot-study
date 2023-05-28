package com.snail.controller;

/**
 * ClassName: HelloController
 * Package: com.snail.controller
 * Description:
 *
 * @Date: 2023-05-27 027 20:40
 * @Author: wangkejing
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//spring 的一个组件
//程序的入口
//@RestController
@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String login() {
    return "hello, world";
    }
}
