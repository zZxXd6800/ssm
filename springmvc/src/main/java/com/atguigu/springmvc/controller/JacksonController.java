package com.atguigu.springmvc.controller;

import com.atguigu.springmvc.bean.Department;
import com.atguigu.springmvc.bean.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhuxu
 * @date 2020/7/22 14:22
 */
@Controller
public class JacksonController {
    @RequestMapping(value = "/dept", method = RequestMethod.GET)
    @ResponseBody
    public Department testDept() {
        return new Department(101, "d-101");
    }

    @RequestMapping(value = "/depts", method = RequestMethod.GET)
    @ResponseBody
    public List<Department> testDepts() {
        List<Department> depts = new ArrayList<>();
        depts.add(new Department(101, "d-101"));
        depts.add(new Department(102, "d-102"));
        depts.add(new Department(103, "d-103"));
        depts.add(new Department(104, "d-104"));
        depts.add(new Department(105, "d-105"));
        depts.add(new Department(106, "d-106"));
        return depts;
    }

    @RequestMapping(value = "/emp", method = RequestMethod.GET)
    @ResponseBody
    public Employee testEmp() {
        return new Employee(1001, "e-1001", new Department(101, "d-101"));
    }

    @RequestMapping(value = "/emps", method = RequestMethod.GET)
    @ResponseBody
    public List<Employee> testEmps() {
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee(1001, "e-1001", new Department(101, "d-101")));
        emps.add(new Employee(1002, "e-1002", new Department(102, "d-102")));
        emps.add(new Employee(1003, "e-1003", new Department(103, "d-103")));
        return emps;
    }
}
