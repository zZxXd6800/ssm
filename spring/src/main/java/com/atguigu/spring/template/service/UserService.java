package com.atguigu.spring.template.service;

import com.atguigu.spring.template.dao.UserDao;
import com.atguigu.spring.template.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhuxu
 * @date 2020/7/16 10:50
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void addUser(User user) {
        userDao.add(user);
    }

    public void updateUser(User user) {
        userDao.update(user);
    }

    public void deleteUser(User user) {
        userDao.delete(user);
    }

    public int queryCount() {
        return userDao.selectCount();
    }

    public User queryUserById(int id) {
        return userDao.selectById(id);
    }

    public List<User> queryAllUser() {
        return userDao.selectAllUser();
    }

    public void batchAdd(List<Object[]> batchArgs) {
        userDao.batchInsert(batchArgs);
    }

    public void batchUpdate(List<Object[]> batchArgs) {
        userDao.batchUpdate(batchArgs);
    }

    public void batchDelete(List<Object[]> batchArgs) {
        userDao.batchDelete(batchArgs);
    }
}
