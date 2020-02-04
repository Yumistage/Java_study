package com.zeroten.InnerClass;

import com.zeroten.javales.InnerClass.CalcMinMax;
import com.zeroten.javales.InnerClass.Pair;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CalcMinMaxTest {

    @Test
    public void testCalc() {

        int[] result = CalcMinMax.calc(1, 3, 2, 9, 30, 7, 2);
        System.out.println(Arrays.toString(result));

        CalcMinMax.Pair pair = CalcMinMax.calc2(1, 3, 2, 9, 30, 7, 2);
        System.out.println(pair.getMin());
        System.out.println(pair.getMax());


    }
}
