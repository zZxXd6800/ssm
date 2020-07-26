package com.atguigu.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author zhuxu
 * @date 2020/7/15 23:06
 */
public class BookProxy {

    public void before() {
        System.out.println("before ...");
    }

    public void afterReturning() {
        System.out.println("after returning ...");
    }

    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("before around ...");
        Object proceed = point.proceed();
        System.out.println("after around ...");
        return proceed;
    }

    public void afterThrowing() {
        System.out.println("after throwing ...");
    }

    public void after() {
        System.out.println("after ...");
    }
}
