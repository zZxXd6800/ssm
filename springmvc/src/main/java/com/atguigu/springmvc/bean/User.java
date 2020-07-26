package com.atguigu.springmvc.bean;

import org.springframework.stereotype.Component;

/**
 * @author zhuxu
 * @date 2020/7/20 19:32
 */
@Component
public class User {
    private Integer id;
    private String name;
    private Address address;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public User() {
        System.out.println("User Non-param Constructor");
    }

    public User(Integer id, String name, Address address) {
        System.out.println("User Constructor with param");
        this.id = id;
        this.name = name;
        this.address = address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
