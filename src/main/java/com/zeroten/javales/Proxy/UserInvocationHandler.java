package com.zeroten.javales.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//JDK动态代理，事件处理器，实现InvocationHandler
public class UserInvocationHandler implements InvocationHandler {
    public Object object;

    public UserInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (args != null && args.length == 1) {
            if (args[0] instanceof User) {
                System.out.println("参数1是User");
                User user = (User) args[0];
                if (user.getName() == null || user.getName().trim().length() == 0) {
                    return false;
                }
                if (user.getAge() == null || user.getAge() < 0) {
                    return false;
                }
            }
        }
        Object result = method.invoke(object, args);
        return result;

    }
}
