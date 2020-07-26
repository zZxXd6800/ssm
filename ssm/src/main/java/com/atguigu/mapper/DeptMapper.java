package com.atguigu.mapper;

import com.atguigu.bean.Department;

import java.util.List;

/**
 * @author zhuxu
 * @date 2020/7/25 16:04
 */
public interface DeptMapper {
    /**
     * 获取所有部门信息
     */
    List<Department> getAllDept();

    /**
     * 根据部门id获取部门信息
     */
    Department getDeptById(String id);
}
