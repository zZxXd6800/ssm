package com.atguigu.spring.transaction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author zhuxu
 * @date 2020/7/16 15:21
 */
@Repository
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate template;

    @Override
    public void addMoney() {
        String sql = "update t_account set money = money + ? where username = ?";
        template.update(sql, 100, "mary");
    }

    @Override
    public void reduceMoney() {
        String sql = "update t_account set money = money - ? where username = ?";
        template.update(sql, 100, "lucy");
    }
}
