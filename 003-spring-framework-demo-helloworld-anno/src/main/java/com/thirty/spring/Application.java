package com.thirty.spring;

import com.thirty.spring.entity.User;
import com.thirty.spring.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @author 龙恒建
 * @Email longhengjian@utry.cn
 * @date 2022-05-26 17:12
 * @ClassName Application
 * @description: 启动类
 */
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.thirty.spring");

        UserServiceImpl service = context.getBean(UserServiceImpl.class);

        List<User> userList = service.findUserList();

        userList.forEach(a -> System.out.println(a.getName() + "," + a.getAge()));
    }
}
