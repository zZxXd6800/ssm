package com.atguigu.bean;

import java.util.List;

/**
 * @author zhuxu
 * @date 2020/7/24 20:47
 */
public class Department {

    private Integer id;
    private String name;
    private List<Employee> emp;

    public Department() {
    }

    public Department(Integer id, String name, List<Employee> emp) {
        this.id = id;
        this.name = name;
        this.emp = emp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmp() {
        return emp;
    }

    public void setEmp(List<Employee> emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emp=" + emp +
                '}';
    }
}
