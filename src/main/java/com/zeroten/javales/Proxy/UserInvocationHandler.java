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

        Object result = method.invoke(object, args);

        return result;
    }
}
