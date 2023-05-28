package com.snail.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ClassName: Dog
 * Package: com.snail.pojo
 * Description:
 *
 * @Date: 2023-05-27 027 23:25
 * @Author: wangkejing
 */
@Component
@ConfigurationProperties(prefix = "dog")
public class Dog {
//    @Value("旺财")
    private String lastName;

//    @Value("3")
    private Integer age;

    public Dog() {
    }

    public Dog(String lastName, Integer age) {
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return lastName;
    }

    public void setName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
