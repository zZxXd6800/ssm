package com.atguigu.spring.dependency;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhuxu
 * @date 2020/7/19 21:41
 */
public class TestDependency {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("dependency.xml");
        ClassA a = context.getBean("a", ClassA.class);
        ClassB b = context.getBean("b", ClassB.class);
        System.out.println(a);
        System.out.println(b);
    }
}
