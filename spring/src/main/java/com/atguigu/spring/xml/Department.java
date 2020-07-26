package com.atguigu.spring.xml;

/**
 * @author zhuxu
 * @date 2020/7/15 15:15
 */
public class Department {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }
}
