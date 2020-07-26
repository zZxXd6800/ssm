package com.atguigu.spring.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhuxu
 * @date 2020/7/15 10:30
 */
public class TestBean {
    @Test
    public void testUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user", User.class);
        User user0 = context.getBean("user", User.class);
        User user1 = context.getBean("user1", User.class);
        User user2 = context.getBean("user2", User.class);
        User user3 = context.getBean("user3", User.class);
        User user4 = context.getBean("user4", User.class);
        User user5 = context.getBean("user5", User.class);
        System.out.println(user==user0);
        System.out.println(user);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user5);
        user.add();
    }

    @Test
    public void testEmployee() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Employee emp = context.getBean("employee", Employee.class);
        System.out.println(emp);
    }

    @Test
    public void testEmp() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Employee emp = context.getBean("emp", Employee.class);
        System.out.println(emp);
    }

    @Test
    public void testStu() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student stu = context.getBean("stu", Student.class);
        System.out.println(stu);
    }

    @Test
    public void testFactoryBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("myBean", User.class);
        System.out.println(user);
    }

    @Test
    public void testBean() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanpostprocessor.xml");
        Bean bean = context.getBean("bean", Bean.class);
        System.out.println(bean.getName());
        context.close();
    }

    @Test
    public void testAutowired() {

    }
}
