package com.zeroten.jiekou;

import org.junit.Test;

public class InterfaceTest {

    @Test
    public void testName() {
        InterfaceObj obj = new InterfaceObj();
        obj.method();
        System.out.println(obj instanceof Man);
        System.out.println(InterfaceObj.MAX_COUNT);
        obj.print();
        Man.println();
    }


}
