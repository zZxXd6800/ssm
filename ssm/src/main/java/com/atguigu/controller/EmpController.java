package com.atguigu.controller;

import com.atguigu.bean.Employee;
import com.atguigu.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author zhuxu
 * @date 2020/7/24 20:54
 */
@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService service;

    @RequestMapping(value = "/getAllEmp", method = RequestMethod.GET)
    @ResponseBody
    public List<Employee> getAllEmp() {
        return service.getAllEmp();
    }

    @RequestMapping(value = "/getEmpById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Employee getEmpById(@PathVariable String id) {
        return service.getEmpById(id);
    }

    @RequestMapping(value = "/insertEmp", method = RequestMethod.POST)
    @ResponseBody
    public Integer insertEmp(@RequestBody Employee emp) {
        return service.insertEmp(emp);
    }

    @RequestMapping(value = "/updateEmpById", method = RequestMethod.PUT)
    @ResponseBody
    public Integer updateEmpById(@RequestBody Employee emp) {
        return service.updateEmpById(emp);
    }

    @RequestMapping(value = "/deleteEmpById/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Integer deleteEmpById(@PathVariable("id") String id) {
        return service.deleteEmpById(id);
    }

//    @RequestMapping(value = "/deleteEmpById", method = RequestMethod.DELETE)
//    @ResponseBody
//    public Integer deleteEmpById(@RequestBody Map<String, String> map) {
//        return service.deleteEmpById(map.get("id"));
//    }
}
