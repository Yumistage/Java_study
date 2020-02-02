package com.zeroten.chouxiang;

import org.junit.Test;

public class AbstractTest {

    @Test
    public void testPrint() {
        Persion p1=new Teacher();
        System.out.println(p1.getDescrition());

        Persion p2=new Student();
        System.out.println(p2.getDescrition());

    }
}
