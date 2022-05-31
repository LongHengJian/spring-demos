package com.thirty.spring.service;

import org.springframework.stereotype.Service;

/**
 * @author 龙恒建
 * @Email longhengjian@utry.cn
 * @date 2022-05-30 17:25
 * @ClassName JdkProxyDemoServiceImpl
 * @description: JDK代理方式
 */
@Service
public class JdkProxyDemoServiceImpl implements IJdkProxyService {

    @Override
    public void doMethod1() {
        System.out.println("JdkProxyServiceImpl.doMethod1()");
    }

    @Override
    public String doMethod2() {
        System.out.println("JdkProxyServiceImpl.doMethod2()");
        return "hello world";
    }

    @Override
    public String doMethod3() throws Exception {
        System.out.println("JdkProxyServiceImpl.doMethod3()");
        throw new Exception("some exception");
    }
}
