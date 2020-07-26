package com.atguigu.spring.template.dao;

import com.atguigu.spring.template.entity.User;

import java.util.List;

/**
 * @author zhuxu
 * @date 2020/7/16 10:50
 */
public interface UserDao {
    void add(User user);

    void update(User user);

    void delete(User user);

    int selectCount();

    User selectById(int id);

    List<User> selectAllUser();

    void batchInsert(List<Object[]> batchArgs);

    void batchUpdate(List<Object[]> batchArgs);

    void batchDelete(List<Object[]> batchArgs);
}
