package com.atguigu.spring.template;

import com.atguigu.spring.template.entity.User;
import com.atguigu.spring.template.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhuxu
 * @date 2020/7/16 10:33
 */
public class TestTemplate {

    @Test
    public void testAddUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("template.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user = new User();
        user.setUserId(1);
        user.setUserName("user-01");
        user.setUserStatus("user01-status");
        userService.addUser(user);
    }

    @Test
    public void testUpdateUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("template.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user = new User();
        user.setUserId(1);
        user.setUserName("user01");
        user.setUserStatus("status-user01");
        userService.updateUser(user);
    }

    @Test
    public void testDeleteUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("template.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user = new User();
        user.setUserId(1);
        user.setUserName("user-01");
        user.setUserStatus("user01-status");
        userService.deleteUser(user);
    }

    @Test
    public void testQueryCount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("template.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService.queryCount());
    }

    @Test
    public void testQueryByUserId() {
        ApplicationContext context = new ClassPathXmlApplicationContext("template.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService.queryUserById(1));
        System.out.println(userService.queryUserById(2));
    }

    @Test
    public void testQueryAllUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("template.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService.queryAllUser());
    }

    @Test
    public void testBatchInsert() {
        ApplicationContext context = new ClassPathXmlApplicationContext("template.xml");
        UserService userService = context.getBean("userService", UserService.class);
        List<Object[]> args = new ArrayList<>();
        Object[] arg1 = new Object[]{1, "user-01", "status-01"};
        Object[] arg2 = new Object[]{2, "user-02", "status-02"};
        Object[] arg3 = new Object[]{3, "user-03", "status-03"};
        Object[] arg4 = new Object[]{4, "user-04", "status-04"};
        Object[] arg5 = new Object[]{5, "user-05", "status-05"};
        args.add(arg1);
        args.add(arg2);
        args.add(arg3);
        args.add(arg4);
        args.add(arg5);
        userService.batchAdd(args);
    }

    @Test
    public void testBatchUpdate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("template.xml");
        UserService userService = context.getBean("userService", UserService.class);
        List<Object[]> args = new ArrayList<>();
        Object[] arg1 = new Object[]{"status-1", "user-1", 1};
        Object[] arg2 = new Object[]{"status-2", "user-2", 2};
        Object[] arg3 = new Object[]{"status-3", "user-3", 3};
        Object[] arg4 = new Object[]{"status-4", "user-4", 4};
        Object[] arg5 = new Object[]{"status-5", "user-5", 5};
        args.add(arg1);
        args.add(arg2);
        args.add(arg3);
        args.add(arg4);
        args.add(arg5);
        userService.batchUpdate(args);
    }

    @Test
    public void testBatchDelete() {
        ApplicationContext context = new ClassPathXmlApplicationContext("template.xml");
        UserService userService = context.getBean("userService", UserService.class);
        List<Object[]> args = new ArrayList<>();
        Object[] arg3 = new Object[]{3};
        Object[] arg4 = new Object[]{4};
        Object[] arg5 = new Object[]{5};
        args.add(arg3);
        args.add(arg4);
        args.add(arg5);
        userService.batchDelete(args);
    }
}
