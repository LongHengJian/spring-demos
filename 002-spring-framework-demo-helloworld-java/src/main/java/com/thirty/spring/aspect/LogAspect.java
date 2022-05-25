package com.thirty.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * @author 龙恒建
 * @Email longhengjian@utry.cn
 * @date 2022-05-24 17:34
 * @ClassName LogAspect
 * @description: 拦截Service方法, 并输出日志
 */
@Aspect
public class LogAspect {

    /**
     * 切面功能,对service的方法进行拦截，并输出日志
     * @param proceedingJoinPoint 进程对象
     * @return 输出正在运行的进程
     * @throws Throwable 异常
     * 指定Service下面的所有方法
     */
    @Around("execution(* com.thirty.spring.service.*.*(..))")
    public Object businessService(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // 获取方法
        Method method = ((MethodSignature) proceedingJoinPoint.getSignature()).getMethod();
        System.out.println("execute method: " + method.getName());
        return proceedingJoinPoint.proceed();
    }
}