package com.zeroten.classObject;

import org.junit.Test;

import java.util.*;
import java.util.zip.ZipFile;

public class Testpkg {

    @Test
    public void testName() {
        Date date = new Date();
        System.out.println(date.toString());
        int[] numbs1 = new int[3];
        int[] numbs2 = new int[]{1, 2, 3};
        int[] numbs3 = {1, 2, 3};
        System.out.println(Arrays.toString(numbs1));

        Collection c;
        ZipFile zf;


    }
}
