package com.atguigu.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author zhuxu
 * @date 2020/7/15 22:45
 */
@Component
@Aspect
@Order(value = 1)
public class UserProxy2 {

    // 抽取相同切入点
    @Pointcut(value = "execution(* com.atguigu.spring.aspect.User.sub(..))")
    public void pointCut2(){}

    //前置通知，add方法之前执行
    @Before(value = "pointCut2()")
    public void before(JoinPoint point) {
        System.out.println("UserProxy2 before ...");
        Object[] args = point.getArgs();
        String methodName = point.getSignature().getName();
        System.out.println("method name: " + methodName + ", args: " + Arrays.toString(args));
    }

    //返回通知，方法正常返回之后执行，有异常时不执行
    @AfterReturning(value = "pointCut2()", returning = "result")
    public void afterReturning(int result) {
        System.out.println("UserProxy2 after returning ...");
        System.out.println("result = " + result);
    }

    //环绕通知，在ProceedingJoinPoint之前和之后执行
    @Around(value = "execution(* com.atguigu.spring.aspect.User.div(..))")
    public Object around(ProceedingJoinPoint point) {
        Object proceed = null;
        try {
            //前置通知
            System.out.println("Around::before");
            proceed = point.proceed();
            //返回通知
            System.out.println("Around::after returning");
        } catch (Throwable throwable) {
            //异常通知
            System.out.println("Around::after throwing");
            throwable.printStackTrace();
        } finally {
            //后置通知
            System.out.println("Around::after");
        }
        return proceed;
    }

    //异常通知，发生异常时执行
    @AfterThrowing(value = "pointCut2()", throwing = "e")
    public void afterThrowing(Exception e) {
        System.out.println("UserProxy2 after throwing ...");
        System.out.println(e);
    }

    //后置通知，有无异常都执行
    @After(value = "pointCut2()")
    public void after() {
        System.out.println("UserProxy2 after ...");
    }
}
