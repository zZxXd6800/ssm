package com.atguigu.spring.aspect;

import org.springframework.stereotype.Component;

/**
 * @author zhuxu
 * @date 2020/7/15 22:14
 */
@Component
public class User {
    public void add() {
//        System.out.println(1/0);
        System.out.println("add...");
    }

    public int sub(int i, int j) {
//        System.out.println(1/0);
        int result = i-j;
        System.out.println("execute: " + i + " - " + j + " = " + result);
        return result;
    }

    public int div(int i, int j) {
        int result = i / j;
        System.out.println(i + " / " + j + " = " + result);
        return result;
    }
}
