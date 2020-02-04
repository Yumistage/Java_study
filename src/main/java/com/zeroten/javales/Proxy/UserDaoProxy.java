package com.zeroten.javales.Proxy;

import java.security.PublicKey;

public class UserDaoProxy implements UserDao {

    public UserDao target;

    public UserDaoProxy(UserDao target) {
        this.target = target;
    }

    @Override
    public boolean Save(User user) {

        if (user.getName() == null || user.getName().trim().length() == 0) {
            System.out.println("姓名为空，不保存");
            return false;
        }
        if (user.getAge() > 200 || user.getAge() <= 0) {
            System.out.println("年龄为空，不保存");
            return false;
        }
        this.target.Save(user);
        return false;
    }
}
