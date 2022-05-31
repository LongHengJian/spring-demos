package com.thirty.spring.service;

/**
 * @author 龙恒建
 * @Email longhengjian@utry.cn
 * @date 2022-05-30 17:24
 * @ClassName IJdkProxyService
 * @description: 代理类接口
 */
public interface IJdkProxyService {

    /**
     * 目标方法1
     */
    void doMethod1();

    /**
     * 目标方法2
     * @return String
     */
    String doMethod2();

    /**
     * 目标方法3
     * @return String
     * @throws Exception 抛出异常
     */
    String doMethod3() throws Exception;

}
