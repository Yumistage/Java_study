package com.zeroten.classObject;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ClassStaticPrefix {
    static final int MAX_COUNT;
    final int IMAX_COUNT;
    public static int count;
    public int index;

    {
        IMAX_COUNT = 7;
    }

    static {
        MAX_COUNT = 6;
    }

    //常量
    public final String STR = "abc";

    public ClassStaticPrefix(int index) {
        this.index = index;
        count++;
    }

    public static void setCount(int count) {

        ClassStaticPrefix.count = count;

    }

    public static void main(String[] args) {
        ClassStaticPrefix obj1 = new ClassStaticPrefix(1);
        System.out.println(obj1.index);
        System.out.println(obj1.count);
        ClassStaticPrefix obj2 = new ClassStaticPrefix(2);
        System.out.println(obj2.index);
        System.out.println(ClassStaticPrefix.count);
    }
}
