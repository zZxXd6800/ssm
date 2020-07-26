package com.atguigu.spring.xml;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author zhuxu
 * @date 2020/7/15 15:57
 */
public class MyFactoryBean implements FactoryBean<User> {

    @Override
    public User getObject() {
        User user = new User();
        user.setId(99);
        user.setName("user-99");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
