package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.bean.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhuxu
 * @date 2020/7/23 14:21
 */
public interface EmpMapper {
    Employee getEmpById(String id);
    Employee getEmpByIdAndNameWithParam(@Param("arg1")String id, @Param("arg2")String name);
    Employee getEmpStep(String id);
    List<Employee> getAllEmp();
    List<Employee> getEmpByDeptId(String id);
    void addEmp(Employee emp);
    Integer updateEmp(Employee emp);
    Boolean deleteEmp(String id);
}
