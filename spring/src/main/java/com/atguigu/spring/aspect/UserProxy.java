package com.atguigu.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author zhuxu
 * @date 2020/7/15 22:15
 */
@Component
@Aspect
@Order(value = 2)
public class UserProxy {

    // 抽取相同切入点
    @Pointcut(value = "execution(* com.atguigu.spring.aspect.User.add(..))")
    public void pointCut(){}

    //前置通知，add方法之前执行
    @Before(value = "pointCut()")
    public void before() {
        System.out.println("before ...");
    }

    //返回通知，方法正常返回之后执行，有异常时不执行
    @AfterReturning(value = "pointCut()")
    public void afterReturning() {
        System.out.println("after returning ...");
    }

    //环绕通知，在ProceedingJoinPoint之前和之后执行
    @Around(value = "pointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("before around ...");
        Object proceed = point.proceed();
        System.out.println("after around ...");
        return proceed;
    }

    //异常通知，发生异常时执行
    @AfterThrowing(value = "pointCut()")
    public void afterThrowing() {
        System.out.println("after throwing ...");
    }

    //后置通知，有无异常都执行
    @After(value = "pointCut()")
    public void after() {
        System.out.println("after ...");
    }
}
