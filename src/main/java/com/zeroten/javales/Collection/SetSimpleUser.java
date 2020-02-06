package com.zeroten.javales.Collection;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class SetSimpleUser {

    public static void main(String[] args) {
        //Set,集，不能有重复元素，可以有Null
        //可能无序或有序
        //HashSet、TreeSet
        //LinkedHashSet EnumSet
        //所有的集都实现了Set接口，而Set继承自Collection
        //我们可以说所有的集都实现了Colletcion接口


        //HashSet中元素不能重复

        //创建
        HashSet set = new HashSet();

        System.out.println(set instanceof Set);
        System.out.println(set instanceof Collection);
        System.out.println(set instanceof List);

        //添加

        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("1");
        set.add("2");
        set.add("E");
        set.add("F");

        //遍历 --for循环(无效)
        //因为是无序的，同样的索引值取出来的可能是不一样

        //遍历--迭代器（有效）
        Iterator<String> iterator = set.iterator();

        System.out.println("HashSet打印");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //list有序：指的是按照插入顺序来保存元素
        //TreeSet 有序:指的是元素排序按照一定规则来排序，Compartor接口
        TreeSet<String> set2=new TreeSet<>();
        set2.add("A");
        set2.add("B");
        set2.add("C");
        set2.add("D");
        set2.add("1");
        set2.add("2");
        set2.add("E");
        set2.add("F");

        //遍历 --for循环(无效)

        //遍历--迭代器（有效）
        Iterator<String> iterator2 = set2.iterator();
        System.out.println("TreeHashSet打印");
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }



        //如果需要使用HashSet的查找元素的高性能，同时又需要按元素插入顺序来排序的
        // LinkedHashSet
        LinkedHashSet<String> set3=new LinkedHashSet<>();
        set3.add("A");
        set3.add("B");
        set3.add("C");
        set3.add("D");
        set3.add("1");
        set3.add("2");
        set3.add("E");
        set3.add("F");

        //遍历 --for循环(无效)

        //遍历--迭代器（有效）
        Iterator<String> iterator3 = set3.iterator();
        System.out.println("LinkedHashSet打印");
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }




    }
}
