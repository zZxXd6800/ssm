package com.atguigu.mybatis;

import com.atguigu.mybatis.bean.Employee;
import com.atguigu.mybatis.mapper.DynamicMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhuxu
 * @date 2020/7/24 10:37
 */
public class TestDynamic {

    private DynamicMapper getMapper() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession(true);
        return session.getMapper(DynamicMapper.class);
    }

    @Test
    public void testMultiQuery() throws IOException {
        DynamicMapper mapper = getMapper();
        Employee employee = new Employee();
//        employee.setId(1);
//        employee.setName("张三");
//        employee.setAge(18);
//        employee.setSex("男");
        List<Employee> employees = mapper.multiQueryEmp(employee);
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    @Test
    public void testBatchDelete() throws IOException {
        DynamicMapper mapper = getMapper();
//        mapper.batchDeleteEmp("6, 9");
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(8);
        list.add(9);
        mapper.batchDeleteEmpByList(list);
    }

    @Test
    public void testBatchInsert() throws IOException {
        DynamicMapper mapper = getMapper();
        mapper.bathInsertEmpByArray(new Employee[]{new Employee(null, "小白", 24, "男"), new Employee(null, "小黑", 25, "女"), new Employee(null, "小黄", 26, "男")});
    }

    @Test
    public void testBatchUpdate() throws IOException {
        DynamicMapper mapper = getMapper();
        mapper.bathUpdateEmpByArray(new Employee[]{new Employee(15, "a", 15, "女"), new Employee(16, "b", 16, "男"), new Employee(17, "c", 17, "女")});
    }
}
