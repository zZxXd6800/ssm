package com.atguigu.spring.annotation.service;

import com.atguigu.spring.annotation.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author zhuxu
 * @date 2020/7/15 19:54
 */
@Service(value = "userService")
public class UserService {

    @Autowired
    @Qualifier(value = "userDao")
    private UserDao userDao;

//    @Resource
//    private UserDao userDao;

//    @Resource(name = "userDao")
//    private UserDao userDao;

//    @Resource(type = UserDaoImpl.class)
//    private UserDao userDao;

    @Value(value = "user_server_name")
    private String name;
    @Value(value = "100")
    private int age;

    public void add() {
        System.out.println(name + "::" + age);
        System.out.println("user service add ...");
        userDao.add();
    }
}
