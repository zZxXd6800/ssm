package com.atguigu.spring.xml;

/**
 * @author zhuxu
 * @date 2020/7/15 16:20
 */
public class Bean {
    private String name;

    public Bean() {
        System.out.println("step1: bean constructor ...");
    }

    public void setName(String name) {
        System.out.println("step2: bean setter ...");
        this.name = name;
    }

    public String getName() {
        System.out.println("step6: bean getter ...");
        return name;
    }

    public void init() {
        System.out.println("step4: bean init ...");
    }

    public void destroy() {
        System.out.println("step7: bean destroy ...");
    }
}
