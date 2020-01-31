package com.zeroten.classObject;

import org.testng.annotations.Test;

public class ClassAccess2 {

    @Test
    public void testAccess() {
        ClassAccess cl1=new ClassAccess();
        System.out.println(cl1.pub);
        System.out.println(cl1.pro);
        System.out.println(cl1.def);

        System.out.println(cl1.getDef());
        System.out.println(cl1.getPro());
        System.out.println(cl1.getPub());
    }
}
