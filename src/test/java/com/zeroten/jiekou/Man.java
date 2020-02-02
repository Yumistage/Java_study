package com.zeroten.jiekou;

public interface Man {

    class InnerClass {
    }

    interface InnerInterface {
    }

    int MAX_COUNT = 100;


    void  method();

    default void print(){
        System.out.println("我是一个default方法");
    }

    static void println(){
        System.out.println("\n我是一个静态方法");
    }

}
