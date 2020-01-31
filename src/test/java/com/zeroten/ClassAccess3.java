package com.zeroten;

import com.zeroten.classObject.ClassAccess;
import com.zeroten.classObject.ClassAccess2;
import org.junit.Test;

public class ClassAccess3 extends ClassAccess {

    @Test
    public void testName() {

        ClassAccess cl1 = new ClassAccess();
        System.out.println(cl1.pub);
        System.out.println(cl1.getPub());

    }
}
