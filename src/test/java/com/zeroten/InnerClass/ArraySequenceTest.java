package com.zeroten.InnerClass;

import com.zeroten.javales.InnerClass.ArraySequence;
import org.junit.Test;

import java.util.Arrays;

public class ArraySequenceTest {

    @Test
    public void Print() {
        ArraySequence as = new ArraySequence(5);
        as.add(1);
        as.add(2);
        as.add(3);
        as.add(4);
        as.add(5);


        ArraySequence.SelectorImpl impl = as.new SelectorImpl();

        while (!impl.end()) {
            System.out.println(impl.current());
            impl.next();
        }
    }
}
