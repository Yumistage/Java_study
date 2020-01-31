package com.zeroten.classObject;

import org.junit.Test;

public class ClassThisTest {

    private int index;


    public ClassThisTest() {

    }

    public void println(String name) {
        System.out.println(this.index + ".hello " + name);
    }

    @Test
    public void testName() {
        ClassThisTest obj = new ClassThisTest();
        obj.println("wendy");
        ClassThisTest obj1 = new ClassThisTest();
        obj1.println("Tom");

    }

    //函数中可变参数只能有一个，并且只能是最后一个
    private void println(int... numbs) {
        if (numbs == null) {
            System.out.println("is null");
            return;
        }
        if (numbs.length == 0) {
            System.out.println("param length is zero");
        }

        for (int n = 0; n < numbs.length; n++) {
            System.out.println(numbs[n]);
        }

        for (int n : numbs
        ) {
            System.out.println(n);
        }

    }

    @Test
    public void Test() {
        System.out.println("参数0");
        System.out.println("参数1");
        println(1);
        System.out.println("参数2");
        println(1, 2, 3, 4, 5);
    }
}
