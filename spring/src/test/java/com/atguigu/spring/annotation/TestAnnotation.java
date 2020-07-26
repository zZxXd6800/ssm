package com.atguigu.spring.annotation;

import com.atguigu.spring.annotation.config.SpringConfig;
import com.atguigu.spring.annotation.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhuxu
 * @date 2020/7/15 17:25
 */
public class TestAnnotation {
    @Test
    public void testService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }

    @Test
    public void testAnnotation() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
