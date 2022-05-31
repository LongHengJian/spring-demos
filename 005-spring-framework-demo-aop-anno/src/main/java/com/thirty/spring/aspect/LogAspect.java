package com.thirty.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author 龙恒建
 * @Email longhengjian@utry.cn
 * @date 2022-05-30 17:21
 * @ClassName LogAspect
 * @description: 切面类
 */
@EnableAspectJAutoProxy
@Component
@Aspect
public class LogAspect {

    @Pointcut("execution(* com.thirty.spring.service.*.*(..))")
    private void pointCutMethod() {

    }

    /**
     * 环绕通知
     * @param proceedingJoinPoint 连接点
     * @return Object
     * @throws Throwable 异常抛出
     */
    @Around("pointCutMethod()")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("-----------------------");
        System.out.println("环绕通知: 进入方法");
        Object o = proceedingJoinPoint.proceed();
        System.out.println("环绕通知: 退出方法");
        return o;
    }

    /**
     * 前置通知.
     */
    @Before("pointCutMethod()")
    public void doBefore() {
        System.out.println("前置通知");
    }

    /**
     * 后置通知.
     *
     * @param result return val
     */
    @AfterReturning(pointcut = "pointCutMethod()", returning = "result")
    public void doAfterReturning(String result) {
        System.out.println("后置通知, 返回值: " + result);
    }

    /**
     * 异常通知
     * @param e 抛出异常
     */
    @AfterThrowing(pointcut = "pointCutMethod()", throwing = "e")
    public void doAfterThrowing(Exception e) {
        System.out.println("异常通知, 异常: " + e.getMessage());
    }


    /**
     * 最终通知
     */
    @After("pointCutMethod()")
    public void doAfter() {
        System.out.println("最终通知");
    }
}
