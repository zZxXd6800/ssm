package com.atguigu.mybatis;

import com.atguigu.mybatis.bean.Department;
import com.atguigu.mybatis.bean.Employee;
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
 * @date 2020/7/23 14:35
 */
public class TestEmp {
    @Test
    public void testGetEmpByIdAndName() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
//        SqlSession session = factory.openSession();// 需要手动处理事务
        SqlSession session = factory.openSession(true);// 设置自动处理事务
        EmpMapper mapper = session.getMapper(EmpMapper.class);

        Employee e = mapper.getEmpById("1");
//        Employee e = mapper.getEmpByIdAndNameWithParam("1", "张三");
        System.out.println(e);

//        Employee e = new Employee(null, "小黑", 25, "女");
//        mapper.addEmp(e);
        // 添加时获取自动生成的主键
        // 在mapper.xml中添加useGeneratedKeys="true"和keyProperty="id"
        // useGeneratedKeys="true"：可以使用自动生成的主键
        // keyProperty="id"：将自动生成的主键赋值给e的id属性
//        System.out.println(e.getId());
//        session.commit();

        // 返回值Integer表示操作影响的行数
//        Integer update = mapper.updateEmp(new Employee(2, "张三三", 19, "女"));
//        System.out.println("update: " + update);

        // 返回值Boolean表示操作是否成功
//        Boolean delete = mapper.deleteEmp("8");
//        System.out.println("delete: " + delete);
    }

    @Test
    public void testGetEmpByDeptId() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession(true);
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        List<Employee> empByDeptId = mapper.getEmpByDeptId("1");
        System.out.println(empByDeptId);
    }

    @Test
    public void testGetAllEmp() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession(true);
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        List<Employee> allEmp = mapper.getAllEmp();
        System.out.println(allEmp);
    }

    @Test
    public void testGetEmpStep() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession(true);
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Employee empStep = mapper.getEmpStep("1");
        System.out.println(empStep.getName());
        System.out.println("==================");
        System.out.println(empStep.getDept());
    }
}
