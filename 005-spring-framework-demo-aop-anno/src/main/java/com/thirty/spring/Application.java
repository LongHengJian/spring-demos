package com.thirty.spring;

import com.thirty.spring.service.CglibProxyDemoServiceImpl;
import com.thirty.spring.service.IJdkProxyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 龙恒建
 * @Email longhengjian@utry.cn
 * @date 2022-05-30 17:26
 * @ClassName Application
 * @description: 启动类
 */
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                "com.thirty.spring");

        // jdk proxy demo
        IJdkProxyService service2 = context.getBean(IJdkProxyService.class);
        service2.doMethod1();
        service2.doMethod2();
        try {
            service2.doMethod3();
        } catch (Exception e) {
            // e.printStackTrace();
        }

        // cglib proxy demo
        CglibProxyDemoServiceImpl service = context.getBean(CglibProxyDemoServiceImpl.class);
        service.doMethod1();
        service.doMethod2();
        try {
            service.doMethod3();
        } catch (Exception e) {
            // e.printStackTrace();
        }


    }
}
