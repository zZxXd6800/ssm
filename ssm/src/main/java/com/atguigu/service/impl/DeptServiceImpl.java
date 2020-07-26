package com.atguigu.service.impl;

import com.atguigu.bean.Department;
import com.atguigu.mapper.DeptMapper;
import com.atguigu.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhuxu
 * @date 2020/7/25 16:48
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper mapper;

    @Override
    public List<Department> getAllDept() {
        return mapper.getAllDept();
    }

    @Override
    public Department getDeptById(String id) {
        return mapper.getDeptById(id);
    }
}
