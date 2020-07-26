//package com.atguigu.spring.transaction;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//
///**
// * @author zhuxu
// * @date 2020/7/16 20:29
// */
//@Configuration
//@ComponentScan(basePackages = {"com.atguigu.spring.transaction"}) // 开启注解扫描
//@EnableTransactionManagement // 开启事务
//public class TransactionConfig {
//
//    // 创建数据库连接池
//    @Bean
//    public DruidDataSource getDruidDataSource() {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql:///db_test?serverTimezone=Asia/Shanghai");
//        dataSource.setUsername("root");
//        dataSource.setPassword("root");
//        return dataSource;
//    }
//
//    // 创建JBDCTemplate
//    @Bean
//    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
//        JdbcTemplate template = new JdbcTemplate();
//        template.setDataSource(dataSource);
//        return template;
//    }
//
//    // 创建事务管理器
//    @Bean
//    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource) {
//        DataSourceTransactionManager manager = new DataSourceTransactionManager();
//        manager.setDataSource(dataSource);
//        return manager;
//    }
//}
