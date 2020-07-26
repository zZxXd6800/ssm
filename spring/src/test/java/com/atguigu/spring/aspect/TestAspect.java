package com.atguigu.spring.aspect;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhuxu
 * @date 2020/7/15 22:23
 */
public class TestAspect {
    @Test
    public void testAnnotation() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AspectConfig.class);
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testAfterReturning() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AspectConfig.class);
        User user = context.getBean("user", User.class);
        user.sub(2, 1);
    }

    @Test
    public void testAround() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AspectConfig.class);
        User user = context.getBean("user", User.class);
        user.div(2, 2);
    }

    @Test
    public void testXML() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aspect.xml");
        Book book = context.getBean("book", Book.class);
        book.read();
    }
}
