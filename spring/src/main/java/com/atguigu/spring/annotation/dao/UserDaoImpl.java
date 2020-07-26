package com.atguigu.spring.annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * @author zhuxu
 * @date 2020/7/15 20:12
 */
@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("user dao add ...");
    }
}
