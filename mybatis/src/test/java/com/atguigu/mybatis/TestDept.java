package com.atguigu.mybatis;

import com.atguigu.mybatis.bean.Department;
import com.atguigu.mybatis.bean.Employee;
import com.atguigu.mybatis.mapper.DeptMapper;
import com.atguigu.mybatis.mapper.EmpMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author zhuxu
 * @date 2020/7/23 20:42
 */
public class TestDept {
    @Test
    public void testGetEmpStep() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession(true);
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        Department deptById = mapper.getDeptById("1");
        System.out.println(deptById.getName());
        System.out.println("=================");
        System.out.println(deptById.getEmps());
    }

    @Test
    public void testGetAllDept() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession(true);
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        List<Department> allDDept = mapper.getAllDept();
        System.out.println(allDDept);
    }

    @Test
    public void testGetDeptWithEmps() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession(true);
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        Department deptWithEmps = mapper.getDeptWithEmps("1");
        System.out.println(deptWithEmps);
    }
}
