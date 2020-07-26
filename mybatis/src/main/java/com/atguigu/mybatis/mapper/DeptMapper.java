package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.bean.Department;

import java.util.List;

/**
 * @author zhuxu
 * @date 2020/7/23 14:22
 */
public interface DeptMapper {
    Department getDeptById(String id);
    Department getDeptWithEmps(String id);
    List<Department> getAllDept();
}
