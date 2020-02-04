package com.zeroten.javales.Proxy;

/*
 * 实体类
 * */
public class User {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
