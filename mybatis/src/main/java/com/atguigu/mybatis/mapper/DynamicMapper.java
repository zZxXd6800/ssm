package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.bean.Employee;

import java.util.List;

/**
 * @author zhuxu
 * @date 2020/7/24 10:37
 */
public interface DynamicMapper {
    //根据eid, ename, age, sex多条件查询员工信息
    List<Employee> multiQueryEmp(Employee e);
    //通过eid组成的字符串实现批量删除
    void batchDeleteEmpByStr(String id);
    //通过eid组成的List集合实现批量删除
    void batchDeleteEmpByList(List<Integer> list);
    //批量添加Emp
    void bathInsertEmpByArray(Employee[] array);
    //批量修改Emp
    void bathUpdateEmpByArray(Employee[] array);
}
