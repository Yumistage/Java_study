package com.zeroten.javales.map;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MapTool {

    public static void main(String[] args) {
        //两个工具类：Arrays(数组) Collections（集合）
        //大小固定用数组，不固定用集合
        Integer[] intArr = {1, 3, 5, 2, 6, 4};
        int[] intArr2 = {1, 3, 5, 2, 6, 4};
        // System.out.println(Arrays.toString(intArr));
        Arrays.sort(intArr);
        //System.out.println(Arrays.toString(intArr));
        // System.out.println(Arrays.toString(intArr2));

        //数组->集合的转换
        //asList方法，如果参数是基本类型数组，会将数组整体作为一个元素
        //         集合里面不能存放基本数据类型
        //asList转换后的集合是不能改变结构
        //sublist的操作会反馈到原集合中

        //Collections  二分查找:binarySearch
        List list = Arrays.asList(intArr);
        // System.out.println(list);
        List list2 = Arrays.asList(intArr2);


        //集合->数组
        Object[] arr = list.toArray();
        // System.out.println(Arrays.toString(arr));

        List<String> lst = new ArrayList<>();

        lst = Collections.nCopies(10, "1");
        System.out.println(lst);
        System.out.println(lst.subList(lst.size() - 3, lst.size()));

        Collections.unmodifiableList(lst);

    }
}
