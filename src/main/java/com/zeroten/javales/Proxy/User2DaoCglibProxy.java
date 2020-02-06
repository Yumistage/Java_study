package com.zeroten.javales.Proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class User2DaoCglibProxy implements MethodInterceptor {

    private Object object;

    public User2DaoCglibProxy(Object object) {
        this.object = object;
    }

    public Object GetProxyInstance() {
        Enhancer en = new Enhancer();
        //设置父类
        en.setSuperclass(object.getClass());
        //设置回调
        en.setCallback(this);
        //返回当前类对象
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("开始执行");
        Object resultObj = method.invoke(object, objects);
        System.out.println("结束执行");

        return resultObj;
    }
}
