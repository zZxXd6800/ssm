package com.atguigu.spring.proxy;

import com.atguigu.spring.proxy.cglib.CglibProxy;
import com.atguigu.spring.proxy.cglib.TeacherDao;
import com.atguigu.spring.proxy.jdk.JDKProxy;
import com.atguigu.spring.proxy.jdk.UserDao;
import com.atguigu.spring.proxy.jdk.UserDaoImpl;
import org.junit.Test;

/**
 * @author zhuxu
 * @date 2020/7/15 21:10
 */
public class TestProxy {
    @Test
    public void testJDKProxy() {
        UserDao target = new UserDaoImpl();
        JDKProxy jdkProxy = new JDKProxy(target);
        UserDao proxy = (UserDao) jdkProxy.getJDKProxyInstance();
        int add = proxy.add(1, 1);
        String res = proxy.update("target");

        System.out.println(add);
        System.out.println(res);
    }

    @Test
    public void testCglibProxy() {
        TeacherDao target = new TeacherDao();
        CglibProxy cglibProxy = new CglibProxy(target);
        TeacherDao proxy = (TeacherDao) cglibProxy.getCglibProxyInstance();
        int add = proxy.add(1, 1);
        String res = proxy.update("target");

        System.out.println(add);
        System.out.println(res);
    }
}
