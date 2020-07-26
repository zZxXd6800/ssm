package com.atguigu.spring.transaction.service;

import com.atguigu.spring.transaction.dao.AccountDao;

/**
 * @author zhuxu
 * @date 2020/7/16 20:01
 */
public class AccountServiceXML {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void accountMoney() {
        accountDao.reduceMoney();
//        System.out.println(1/0);// 模拟异常
        accountDao.addMoney();
    }
}
