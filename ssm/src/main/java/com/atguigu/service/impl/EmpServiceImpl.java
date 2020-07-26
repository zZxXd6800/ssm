package com.atguigu.service.impl;

import com.atguigu.bean.Employee;
import com.atguigu.mapper.EmpMapper;
import com.atguigu.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhuxu
 * @date 2020/7/24 20:54
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper mapper;

    @Override
    public List<Employee> getAllEmp() {
        return mapper.getAllEmp();
    }

    @Override
    public Employee getEmpById(String id) {
        return mapper.getEmpById(id);
    }

    @Override
    public Integer insertEmp(Employee emp) {
        return mapper.insertEmp(emp);
    }

    @Override
    public Integer updateEmpById(Employee emp) {
        return mapper.updateEmpById(emp);
    }

    @Override
    public Integer deleteEmpById(String id) {
        return mapper.deleteEmpById(id);
    }
}
