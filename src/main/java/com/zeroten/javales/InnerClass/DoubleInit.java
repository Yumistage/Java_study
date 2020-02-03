package com.zeroten.javales.InnerClass;

import java.util.ArrayList;
import java.util.List;

public class DoubleInit {

    public static void main(String[] args) {
        //双括号初始化
        List<Integer> numbs = new ArrayList();

        numbs.add(1);
        numbs.add(2);
        numbs.add(3);
        numbs.add(4);
        numbs.add(5);

        System.out.println(numbs);

        List<Integer> numbs1 = new ArrayList() {{

            add(1);
            add(2);
            add(3);
            add(4);
            add(5);

        }};


        System.out.println(numbs1);


        List<Integer> numbs2 = new ArrayList() {{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);

        }};
        System.out.println(numbs2);


    }
}
