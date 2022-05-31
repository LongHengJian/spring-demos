package com.thirty.spring.springmvc.entity;

/**
 * @author 龙恒建
 * @Email longhengjian@utry.cn
 * @date 2022-05-31 16:09
 * @ClassName User
 * @description: user实体类
 */
public class User {

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
