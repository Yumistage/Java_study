package com.zeroten.fow;

import org.testng.annotations.Test;

public class CodeBlockl {

    @Test
    public void testBlockScope(){
        int n1=100;
        System.out.println(n1);
        {
            int n2=200;
            System.out.println(n1+n2);
        }
    }


}
