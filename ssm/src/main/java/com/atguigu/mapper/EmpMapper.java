package com.atguigu.mapper;

import com.atguigu.bean.Employee;

import java.util.List;

/**
 * @author zhuxu
 * @date 2020/7/24 20:54
 */
public interface EmpMapper {
    /**
     * 获取所有员工信息
     */
    List<Employee> getAllEmp();

    /**
     * 根据员工id获取员工信息
     */
    Employee getEmpById(String id);

    /**
     * 添加新员工
     */
    Integer insertEmp(Employee emp);

    /**
     * 根据员工id修改员工信息
     */
    Integer updateEmpById(Employee emp);

    /**
     * 根据员工id删除员工信息
     */
    Integer deleteEmpById(String id);
}
