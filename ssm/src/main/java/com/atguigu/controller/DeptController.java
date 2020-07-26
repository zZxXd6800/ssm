package com.atguigu.controller;

import com.atguigu.bean.Department;
import com.atguigu.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zhuxu
 * @date 2020/7/25 16:51
 */
@Controller
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService service;

    @RequestMapping(value = "/getAllDept", method = RequestMethod.GET)
    @ResponseBody
    public List<Department> getAllDept() {
        return service.getAllDept();
    }

    @RequestMapping(value = "/getDeptById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Department getDeptById(@PathVariable("id") String id) {
        return service.getDeptById(id);
    }
}
