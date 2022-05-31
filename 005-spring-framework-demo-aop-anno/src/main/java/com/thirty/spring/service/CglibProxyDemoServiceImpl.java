package com.thirty.spring.service;

import org.springframework.stereotype.Service;

/**
 * @author 龙恒建
 * @Email longhengjian@utry.cn
 * @date 2022-05-30 17:22
 * @ClassName CglibProxyDemoServiceImpl
 * @description: Cglib代理方式
 */
@Service
public class CglibProxyDemoServiceImpl {

    public void doMethod1() {
        System.out.println("CglibProxyDemoServiceImpl.doMethod1()");
    }

    public String doMethod2() {
        System.out.println("CglibProxyDemoServiceImpl.doMethod2()");
        return "hello world";
    }

    public String doMethod3() throws Exception {
        System.out.println("CglibProxyDemoServiceImpl.doMethod3()");
        throw new Exception("some exception");
    }
}
