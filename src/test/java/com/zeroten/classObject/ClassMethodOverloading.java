package com.zeroten.classObject;

import org.junit.Test;

public class ClassMethodOverloading {

    public void println() {

    }

    public void println(int numb) {

    }

    public void println(String str) {

    }

    public void println(int numb1, int numb2) {

    }

    @Test
    public void testMethodOver() {
        println();
        println(2);
        println("2");
        println(2, 2);
    }
}
