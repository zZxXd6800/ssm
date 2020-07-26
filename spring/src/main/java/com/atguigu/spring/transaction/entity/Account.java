package com.atguigu.spring.transaction.entity;

/**
 * @author zhuxu
 * @date 2020/7/16 15:26
 */
public class Account {
    private int id;
    private String userName;
    private int money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", money=" + money +
                '}';
    }
}
