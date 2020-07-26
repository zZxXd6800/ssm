package com.atguigu.spring.proxy.cglib;

/**
 * @author zhuxu
 * @date 2020/7/16 9:58
 */
public class TeacherDao {
    public int add(int a, int b) {
        return a+b;
    }

    public String update(String id) {
        return id;
    }
}
