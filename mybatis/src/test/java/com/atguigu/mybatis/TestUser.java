package com.atguigu.mybatis;

import com.atguigu.mybatis.bean.User;
import com.atguigu.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author zhuxu
 * @date 2020/7/23 11:28
 */
public class TestUser {
    @Test
    public void test() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession();
        // 通过动态代理生成UserMapper的代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.getClass().getName());
        User userById1 = mapper.getUserById1("1");
        System.out.println(userById1);
        User userById2 = mapper.getUserById2("1");
        System.out.println(userById2);
    }
}
