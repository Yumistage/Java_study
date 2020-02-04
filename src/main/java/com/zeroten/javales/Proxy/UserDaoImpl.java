package com.zeroten.javales.Proxy;

/*
 * 数据库读写操作 DAO层
 *
 * */
public class UserDaoImpl implements UserDao {

    @Override
    public boolean Save(User user) {
        System.out.println("保存成功");
        System.out.println("当前用户Name: " + user.getName());
        System.out.println("当前用户年龄: " + user.getAge());
        return true;

    }
}
