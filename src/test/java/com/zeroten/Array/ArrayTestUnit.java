package com.zeroten.Array;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

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

    @Test
    public void test数组拷贝() {

        Integer[] arr1={1,2,3,4,5};
        Integer[] arr2={6,7,8,9,10};

        //拷贝arr1的前3个元素生成一个新的数组
        Integer[] arr3=Arrays.copyOf(arr1,3);
        System.out.println(Arrays.toString(arr3));

        //拷贝arr2的后3个元素生成一个新的数组
        Integer[] arr4=Arrays.copyOfRange(arr2,2,4);
        System.out.println(Arrays.toString(arr4));

        //把arr2的后三位拷贝到arr1的后三位
        System.arraycopy(arr2,arr2.length-3,arr1,arr1.length-3,3);
        System.out.println(Arrays.toString(arr1));






    }

    @Test
    public void test数组填充() {
        int[] arr=new int[10];

        //填充数组为5
        Arrays.fill(arr,5);
        System.out.println(Arrays.toString(arr));

        for (int index=arr.length-3;index<arr.length;index++){
            arr[index]=3;
        }
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr,0,6,5);
        Arrays.fill(arr,7,arr.length,3);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test数组排序() {
        //定义一个大小为100的int数组，随机给每一位赋值一个0~100的数值，然后排序并打印结果
        int[]arr=new int[100];
        for (int index=0;index<100;index++){
            arr[index]=new Random().nextInt(100);
        }
        System.out.println("排序前： "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后： "+Arrays.toString(arr));
    }
}
