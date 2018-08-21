package com.axing.bean;
import java.io.Serializable;

public class User implements Serializable{

    //用户编号
    private int id;
    //用户名
    private String userName;
    //密码
    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(int id, String userName, String password) {
        super();
        this.id = id;
        this.userName = userName;
        this.password = password;
    }
}