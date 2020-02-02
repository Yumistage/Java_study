package com.zeroten.Clone;

import com.zeroten.jicheng.Employee;
import org.junit.Test;

public class CloneTest {


    @Test
    public void testClone() throws CloneNotSupportedException {
        Employee em1=new Employee();
        Employee em2=em1.Clone();

    }
}
