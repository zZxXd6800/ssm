package com.atguigu.spring.transaction;

import com.atguigu.spring.transaction.service.AccountService;
import com.atguigu.spring.transaction.service.AccountServiceXML;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhuxu
 * @date 2020/7/16 10:32
 */
public class TestTransaction {
    @Test
    public void testAccountAnnotation() {
        ApplicationContext context = new ClassPathXmlApplicationContext("transaction_anno.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.accountMoney();
    }

    @Test
    public void testAccountAnnotation2() {
//        ApplicationContext context = new AnnotationConfigApplicationContext(TransactionConfig.class);
//        AccountService accountService = context.getBean("accountService", AccountService.class);
//        accountService.accountMoney();
    }

    @Test
    public void testAccountXML() {
        ApplicationContext context = new ClassPathXmlApplicationContext("transaction_config.xml");
        AccountServiceXML accountService = context.getBean("accountServiceXML", AccountServiceXML.class);
        accountService.accountMoney();
    }
}
