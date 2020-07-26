package com.atguigu.spring.proxy.jdk;

/**
 * @author zhuxu
 * @date 2020/7/15 20:58
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
