package com.thirty.spring;

import com.thirty.spring.config.BeansConfig;
import com.thirty.spring.entity.User;
import com.thirty.spring.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @author 龙恒建
 * @Email longhengjian@utry.cn
 * @date 2022-05-25 17:29
 * @ClassName Application
 * @description: 启动类
 */
public class Application {

    public static void main(String[] args) {
        // 获取配置类
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);

        // 用户服务类
        UserServiceImpl service = context.getBean("userService", UserServiceImpl.class);

        List<User> userList = service.findUserList();

        userList.forEach(a -> System.out.println(a.getName() + "," + a.getAge()));
    }
}
