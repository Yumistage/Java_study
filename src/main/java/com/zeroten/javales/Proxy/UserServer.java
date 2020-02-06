package com.zeroten.javales.Proxy;

import java.lang.reflect.Proxy;

/*
 * 业务服务层
 * 基于接口来做时：接口命名以Service为后缀
 * 接口的实现命名以ServiceImpl为后缀
 */
public class UserServer {

    public static void directCall() {
        User user1 = new User("张三", 20);
        new UserDaoImpl().Save(user1);
        User user2 = new User("", 22);
        new UserDaoImpl().Save(user2);
    }

    public static void staticProxyCall() {
        UserDaoImpl userDao = new UserDaoImpl();
        User user1 = new User("张三", -1);
        UserDaoProxy proxy = new UserDaoProxy(userDao);
        proxy.Save(user1);
    }

    public static void jdkProxyCall() {
        User user1 = new User("张三", 20);
        UserDao userDao = new UserDaoImpl();

        UserInvocationHandler handler = new UserInvocationHandler(userDao);

        /*
        *       userDao.getClass().getClassLoader(), 类加载器
                userDao.getClass().getInterfaces(),  类继承的接口
                handler  时间代理器*/
        UserDao userDaoProxy = (UserDao) Proxy.newProxyInstance(
                userDao.getClass().getClassLoader(),
                userDao.getClass().getInterfaces(),
                handler);
        userDaoProxy.Save(user1);
    }

    public static void jdkProxyCall2() {
        User user1 = new User("张三", 20);
        User2Dao userDao = new User2Dao();

        UserInvocationHandler handler = new UserInvocationHandler(userDao);

        /*
        *       userDao.getClass().getClassLoader(), 类加载器
                userDao.getClass().getInterfaces(),  类继承的接口
                handler  时间代理器*/
        User2Dao userDaoProxy = (User2Dao) Proxy.newProxyInstance(
                userDao.getClass().getClassLoader(),
                userDao.getClass().getInterfaces(),
                handler);
        userDaoProxy.Save(user1);
    }


    private static void cglibProxyCall() {

        User user1 = new User("张三", 20);
        User2Dao userDao = new User2Dao();

        User2DaoCglibProxy cglibProxy = new User2DaoCglibProxy(userDao);
        User2Dao user2DaoProxy = (User2Dao) cglibProxy.GetProxyInstance();
        user2DaoProxy.Save(user1);


//        User user2 = new User("张三", 20);
//        UserDaoImpl userDaoImpl = new UserDaoImpl();
//
//        User2DaoCglibProxy cglibProxy2 = new User2DaoCglibProxy(userDaoImpl);
//        UserDaoImpl user2DaoProxy2 = (UserDaoImpl) cglibProxy2.GetProxyInstance();
//        user2DaoProxy2.Save(user2);
    }

    public static void main(String[] args) {

        //直接调用
        //directCall();

        //1.静态代理:需要新建类与之前的操作类同时继承于同一个接口

        //staticProxyCall();


//        System.out.println("jdk代理");
//        //2.动态代理（JDK代理）
//        jdkProxyCall();

        //2.动态代理-被代理对象不是基于接口来实现的对象
        //jdkProxyCall2();

        //3.cgLib代理，因为是通过子类的方式来实现的，因此也可称为子类代理
        cglibProxyCall();


    }


}
