package com.atguigu.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zhuxu
 * @date 2020/7/20 15:21
 */
@Controller
public class TestController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testGet() {
        System.out.println("success::GET");
        return "success";
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String testPost() {
        System.out.println("success::POST");
        return "success";
    }

    @RequestMapping(value = "/*/ant?/**/testAnt")
    public String testAnt() {
        System.out.println("success::Ant");
        return "success";
    }

    /**
     * localhost:8080/mvc/testRest?id=1001&username=admin
     * localhost:8080/mvc/testRest/1001/admin
     */
    @RequestMapping(value = "/testRest/{id}/{username}")
    public String testRest(@PathVariable("id")Integer id,
                           @PathVariable("username")String username) {
        System.out.println("success::Rest");
        System.out.println("id: " + id + ", username: " + username);
        return "success";
    }
}
