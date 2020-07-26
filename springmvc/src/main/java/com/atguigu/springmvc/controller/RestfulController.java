package com.atguigu.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zhuxu
 * @date 2020/7/20 16:40
 */
@Controller
@RequestMapping("/rest")
public class RestfulController {

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.GET)
    public String getUserById(@PathVariable("id")Integer id) {
        System.out.println("GET, id: " + id);
        return "success";
    }

    @RequestMapping(value = "/testRest", method = RequestMethod.POST)
    public String insertUser() {
        System.out.println("POST");
        return "success";
    }

    @RequestMapping(value = "/testRest", method = RequestMethod.PUT)
    public String updateUser() {
        System.out.println("PUT");
        return "success";
    }

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.DELETE)
    public String deleteUserById(@PathVariable("id")Integer id) {
        System.out.println("DELETE, id: " + id);
        return "success";
    }
}
