package com.thirty.spring;

import com.thirty.spring.service.AopDemoServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 龙恒建
 * @Email longhengjian@utry.cn
 * @date 2022-05-30 16:31
 * @ClassName Application
 * @description: 启动类
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aspects.xml");

        AopDemoServiceImpl service = context.getBean("demoService", AopDemoServiceImpl.class);
        service.doMethod1();
        service.doMethod2();
        try {
            service.doMethod3();
        } catch (Exception e) {
            // e.printStackTrace();
        }
    }
}
