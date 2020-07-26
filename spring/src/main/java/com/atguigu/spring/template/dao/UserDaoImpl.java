package com.atguigu.spring.template.dao;

import com.atguigu.spring.template.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhuxu
 * @date 2020/7/16 10:50
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate template;

    @Override
    public void add(User user) {
        String sql = "insert into t_user values(?, ?, ?)";
        int update = template.update(sql, user.getUserId(), user.getUserName(), user.getUserStatus());
        System.out.println(update);
    }

    @Override
    public void update(User user) {
        String sql = "update t_user set user_status = ?, user_name = ? where user_id = ?";
        int update = template.update(sql, user.getUserStatus(), user.getUserName(), user.getUserId());
        System.out.println(update);
    }

    @Override
    public void delete(User user) {
        String sql = "delete from t_user where user_id = ?";
        int update = template.update(sql, user.getUserId());
        System.out.println(update);
    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from t_user";
        return template.queryForObject(sql, Integer.class);
    }

    @Override
    public User selectById(int id) {
        String sql = "select * from t_user where user_id = ?";
        return template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), id);
    }

    @Override
    public List<User> selectAllUser() {
        String sql = "select * from t_user";
        return template.query(sql, new BeanPropertyRowMapper<>(User.class));
    }

    @Override
    public void batchInsert(List<Object[]> batchArgs) {
        String sql = "insert into t_user values(?, ?, ?)";
        int[] ints = template.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchUpdate(List<Object[]> batchArgs) {
        String sql = "update t_user set user_status = ?, user_name = ? where user_id = ?";
        int[] ints = template.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchDelete(List<Object[]> batchArgs) {
        String sql = "delete from t_user where user_id = ?";
        int[] ints = template.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }
}
