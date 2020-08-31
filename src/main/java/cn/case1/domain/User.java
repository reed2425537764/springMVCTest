package cn.case1.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class User implements Serializable {
    private String username;
    private String password;
    private Account account;
    private Date birthday;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", account=" + account +
                ", birthday=" + birthday +
                ", accountList=" + accountList +
                ", accountMap=" + accountMap +
                '}';
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    private List<Account> accountList;
    private Map<String,Account> accountMap;

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public Map<String, Account> getAccountMap() {
        return accountMap;
    }

    public void setAccountMap(Map<String, Account> accountMap) {
        this.accountMap = accountMap;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
