package com.atguigu.springmvc.controller;

import com.atguigu.springmvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author zhuxu
 * @date 2020/7/20 19:01
 */
@Controller
public class ParamController {
    @RequestMapping(value = "/param", method = RequestMethod.POST)
//    public String test(String username, String password, String address) {
    public String param(@RequestParam(value = "username", required = false, defaultValue = "admin")String arg1,
                        @RequestParam(value = "password", required = false, defaultValue = "123456")String arg2,
                        @RequestParam(value = "address", required = false, defaultValue = "xi'an")String arg3) {
        System.out.println("username: " + arg1 + ", password: " + arg2 + ", address: " + arg3);
        return "success";
    }

    @RequestMapping(value = "/header", method = RequestMethod.GET)
    public String header(@RequestHeader(value = "Accept-Language")String acceptLanguage) {
        System.out.println(acceptLanguage);
        return "success";
    }

    @RequestMapping(value = "/cookie", method = RequestMethod.GET)
    public String cookie(@CookieValue(value = "JSESSIONID")String jSessionId) {
        System.out.println(jSessionId);
        return "success";
    }

    @RequestMapping(value = "/pojo", method = RequestMethod.POST)
    public String test(User user) {
        System.out.println(user);
        return "success";
    }

    @RequestMapping(value = "/servlet", method = RequestMethod.POST)
    public String servlet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request.getParameterMap().get("id"));
        System.out.println(request.getParameterMap().get("name"));
        System.out.println(request.getParameterMap().get("address.province"));
        System.out.println(request.getParameterMap().get("address.city"));
        System.out.println(request.getParameter("id"));
        System.out.println(request.getParameter("name"));
        System.out.println(request.getParameter("address.province"));
        System.out.println(request.getParameter("address.city"));
        return "success";
    }

//    @RequestMapping(value = "/attribute", method = RequestMethod.GET)
//    public String attribute(HttpServletRequest request) {
//        request.setAttribute("name", "request");
//        return "success";
//    }
//
//    @RequestMapping(value = "/attribute", method = RequestMethod.GET)
//    public String attribute(Map<String, Object> map) {
//        map.put("name", "map");
//        return "success";
//    }
//
//    @RequestMapping(value = "/attribute", method = RequestMethod.GET)
//    public String attribute(Model model) {
//        model.addAttribute("name", "model");
//        return "success";
//    }

    @RequestMapping(value = "/attribute", method = RequestMethod.GET)
    public ModelAndView attribute() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("success");
        mav.addObject("name", "ModelAndView");
        return mav;
    }
}
