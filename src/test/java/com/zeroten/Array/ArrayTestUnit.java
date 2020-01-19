package com.zeroten.Array;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTestUnit {
    @Test
    public void test数组定义() {
        int[] arr1;
        String[] arr2;
        int arr3[];
        String arr4[];
    }

    @Test
    public void test赋值() {
        int[] arr1 = new int[5];
        System.out.println(Arrays.toString(arr1));

        boolean[] arr2 = new boolean[3];
        System.out.println(Arrays.toString(arr2));

        String[] arr3 = new String[3];
        System.out.println(Arrays.toString(arr3));


    }

    @Test
    public void test数组的遍历() {
        Integer[] arr = {1, 2, 3, 4, 5};

        //for循环
        System.out.println("for循环");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //foreach
        System.out.println("foreach循环");
        for (int a : arr) {
            System.out.println(a);
        }

        //java8中新增的Lambda表达式
        System.out.println("Lambda循环");

        Arrays.asList(arr).forEach(val->{
            System.out.println(val);
            if (val%2==0){
                System.out.println(String.format("%d 是偶数",val));
            }
            else{
                System.out.println(String.format("%d 是奇数",val));            }

        });

    }
}
