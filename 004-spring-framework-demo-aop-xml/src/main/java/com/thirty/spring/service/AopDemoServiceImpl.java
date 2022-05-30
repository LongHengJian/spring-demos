package com.thirty.spring.service;

/**
 * @author 龙恒建
 * @Email longhengjian@utry.cn
 * @date 2022-05-30 16:32
 * @ClassName AopDemoServiceImpl
 * @description: 目标类
 */
public class AopDemoServiceImpl {

    /**
     * 目标方法1
     */
    public void doMethod1() {
        System.out.println("AopDemoServiceImpl.doMethod1()");
    }

    /**
     * 目标方法2
     * @return String
     */
    public String doMethod2() {
        System.out.println("AopDemoServiceImpl.doMethod2()");
        return "hello world";
    }

    /**
     * 目标方法3
     * @return 抛出异常
     * @throws Exception some Exception
     */
    public String doMethod3() throws Exception {
        System.out.println("AopDemoServiceImpl.doMethod3()");
        throw new Exception("some exception");
    }
}
