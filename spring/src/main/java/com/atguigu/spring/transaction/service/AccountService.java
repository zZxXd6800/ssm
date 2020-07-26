package com.atguigu.spring.transaction.service;

import com.atguigu.spring.transaction.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhuxu
 * @date 2020/7/16 15:20
 */
@Service
@Transactional
public class AccountService {
    @Autowired
    private AccountDao accountDao;

    public void accountMoney() {
        accountDao.reduceMoney();
//        System.out.println(1/0);// 模拟异常
        accountDao.addMoney();
    }
}
