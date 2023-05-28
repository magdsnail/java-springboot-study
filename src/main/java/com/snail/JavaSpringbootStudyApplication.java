package com.snail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication 标注这个类是一个springboot的  应用
@SpringBootApplication
public class JavaSpringbootStudyApplication {
    public static void main(String[] args) {
        //将springboot应用启动
        //springapplication类
        //run 方法
        SpringApplication.run(JavaSpringbootStudyApplication.class, args);
    }

}
