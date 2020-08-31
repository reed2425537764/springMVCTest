package cn.case1.domain;

import java.io.Serializable;

public class Account implements Serializable {
    private String username;
    private double money;

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", money=" + money +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
