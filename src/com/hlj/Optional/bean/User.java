package com.hlj.Optional.bean;

/**
 * @Desc:
 * @Author HealerJean
 * @Date 2018/9/7  ионГ11:29.
 */
public class User {
    private  String email ;

    private String name ;



    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
