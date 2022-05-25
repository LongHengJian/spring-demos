package com.thirty.spring.entity;

/**
 * @author 龙恒建
 * @Email longhengjian@utry.cn
 * @date 2022-05-20 17:13
 * @ClassName User
 * @description: 用户实体类
 */
public class User {

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 用户年龄
     */
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
