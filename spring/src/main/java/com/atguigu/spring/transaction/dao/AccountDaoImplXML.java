package com.atguigu.spring.transaction.dao;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author zhuxu
 * @date 2020/7/16 20:02
 */
public class AccountDaoImplXML implements AccountDao {

    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void addMoney() {
        String sql = "update t_account set money = money + ? where username = ?";
        template.update(sql, 100, "lucy");
    }

    @Override
    public void reduceMoney() {
        String sql = "update t_account set money = money - ? where username = ?";
        template.update(sql, 100, "mary");
    }
}
