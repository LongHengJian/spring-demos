package com.thirty.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author 龙恒建
 * @Email longhengjian@utry.cn
 * @date 2022-05-30 16:35
 * @ClassName LogAspect
 * @description: 切面类
 */
public class LogAspect {

    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("-----------------------");
        System.out.println("环绕通知: 进入方法");
        Object o = proceedingJoinPoint.proceed();
        System.out.println("环绕通知: 退出方法");
        return o;

    }


    /**
     * 前置通知
     */
    public void doBefore(){
        System.out.println("前置通知");
    }

    /**
     * 后置通知，返回值
     * @param result 返回结果
     */
    public void doAfterReturning(String result) {
        System.out.println("后置通知, 返回值: " + result);
    }

    /**
     * 异常通知
     * @param e 抛出异常
     */
    public void doAfterThrowing(Exception e) {
        System.out.println("异常通知, 异常: " + e.getMessage());
    }


    /**
     * 最终通知
     */
    public void doAfter() {
        System.out.println("最终通知");
    }

}
