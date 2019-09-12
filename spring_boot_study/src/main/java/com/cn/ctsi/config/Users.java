package com.cn.ctsi.config;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Users {

    @Autowired
    private List<User1> users;

    public List<User1> getUsers() {
        return users;
    }

    public void setUsers(List<User1> users) {
        this.users = users;
    }
}
