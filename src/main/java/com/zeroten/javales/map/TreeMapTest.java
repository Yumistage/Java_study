package com.zeroten.javales.map;

import java.util.*;

public class TreeMapTest {


    static class Xuhao implements Comparable {

        private Integer index;

        public Xuhao(Integer index) {
            this.index = index;
        }

        @Override
        public String toString() {
            return "学号：" + index;
        }

        @Override
        public int compareTo(Object other) {
            if (other instanceof Integer) {
                return -1;
            } else {
                Xuhao sh = (Xuhao) other;

                if (this.index < sh.index) {
                    return -1;
                } else if (this.index.equals(sh.index)) {
                    return 0;
                }
                return 1;

            }

        }
    }


    public static void main1(String[] args) {
        //HashMap  无序
        //TreeMap  有序，和前边的list有序不一样
        //1.构造
        //2.添加/删除/遍历/修改
        TreeMap<String, String> map = new TreeMap();

        //添加
        map.put("1", "zhangsan,20");
        map.put("3", "lisi,22");
        map.put("2", "wangwu,23");

        //遍历
        //key 集
        //vlaue 集合

        //键值集合
        System.out.println("键值对集合");
        for (Map.Entry<String, String> str :
                map.entrySet()) {
            System.out.println(String.format("Key = %s   Value = %s", str.getKey(), str.getValue()));
        }

        //Key集
        System.out.println("Key键值");
        for (String str :
                map.keySet()) {
            System.out.println(String.format("Key = %s   Value = %s", str, map.get(str)));
        }

        //TreeMap是有序的，这个有序是key值的排序
        //Key值的排序，是通过一个排序接口Comparator
        //String实现的是Comparable 和 Comparator的区别
        //Comparable:自身和传入对象的比较
        //Comparator：是传入的两个对象的比较
        //HashMap使用equlas比较
        //TreeMap使用的是CompareTo比较



    }

    public static void main2(String[] args) {

        TreeMap<Xuhao, String> map = new TreeMap();

        //添加
        map.put(new Xuhao(1), "zhangsan,20");
        map.put(new Xuhao(3), "lisi,22");
        map.put(new Xuhao(2), "wangwu,23");

        System.out.println("键值对集合");
        for (Map.Entry<Xuhao, String> str :
                map.entrySet()) {
            System.out.println(String.format("Key = %s   Value = %s", str.getKey(), str.getValue()));
        }

    }

    public static void main(String[] args) {
        LinkedHashMap<String,String> linkedHashMap=new LinkedHashMap<>();

        //LinkedHashMap具有和HashMap 一样的功能
        //增强：保持元素的插入顺序
        //LinkedHashMap再HashMap的基础上增加了如下的内容：
        //head：指向按插入顺序，第一个元素的引用
        //tail：指向按插入顺序，最后一个元素的引用
        //同时对每一个元素都增加了before after属性


        //weakHashMap，当里面的某个元素不在使用时，可以被垃圾回收器回收
        //EnumMap      Key值必须是枚举类型
        //IdentityHashMap Key值的哈希值计算方式：通常Key值对象.hasCode(),
    }
}
