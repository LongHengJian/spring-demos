package com.thirty.spring;

import com.thirty.spring.entity.User;
import com.thirty.spring.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author 龙恒建
 * @Email longhengjian@utry.cn
 * @date 2022-04-14 22:37
 * @ClassName Application
 * @description: 启动类
 */
public class Application {
    public static void main(String[] args) {

        // 读取配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("aspects.xml", "daos.xml", "services.xml");

        // 获取服务实现类的bean
        UserServiceImpl userService = context.getBean("userService", UserServiceImpl.class);

        List<User> userList = userService.findUserList();

        userList.forEach(user -> System.out.println(user.getName()+ "," + user.getAge()));
    }
}
