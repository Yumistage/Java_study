package com.zeroten.javales.map;

import java.util.*;

public class MapTest {

    /*
     *
     * 内容：
     *
     * 散列表相关知识
     *
     * HashMap
     *       内部实现
     *       常用方法
     * TreeMap
     * */

    /*
     * 散列表 HashTable：也是哈希表
     * 根据数组可以使用下标的方式来快速随机访问来实现的
     * 比如：存放一组数据：aaa,cde,bfk,...
     * 如何快速的定位和查找？
     * String【】 str 采用数组的下标
     * 哈希函数：将关键字转化成一个正整数
     * 定义一个hashFuncion（String）
     * aaa ->256
     * cde ->258
     * bfk ->259
     * str[256]="aaa"
     * str[258]="cde"
     * str[259]="259"
     *
     * 哈希函数最理想的状态;
     * 哈希结果应该是一个正整数
     * str1==str2  hash(str1)=hash(str2)
     * str1!=str2  hash(str1)!=hash(str2)
     *
     *
     * 第三种情况基本不可能，不会存在这么一个函数
     *
     * hash冲突：不同的键值，通过哈希函数返回了相同的结果
     * 解决方法：链表方式
     *         数组里面不直接存值；存一个自定义对象
     *Node
     * {
     *    Node next;//下一个节点
     *    Node prev;//前一个节点
     *    Object item; //值
     * }
     * aaa ->256
     * cde ->258
     * bfk ->259
     * aak ->256
     * str[256]={
     *          prev:null
     *          next:null
     *          item:aaa
     * }
     *
str[256]={
     *          prev:null
     *          next:aaa
     *          item:aak
     * }
     *
     *
     *
     * HashMap
     * MD5，SHA，CRC*/

    static class Student {
        String name;
        Integer age;

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public Student(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Student)) {
                return false;
            }

            Student student = (Student) o;
            return name.equals(student.name) &&
                    age.equals(student.age);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

    }


    public static void main(String[] args) {

        //HashMap
        //1.构建
        Map<String, Student> map = new HashMap<>();
        Map<String, Student> map2 = new HashMap<>(map);
        Map<String, Student> map3 = new HashMap<>(10);
        //2.添加
        //put(key.value)
        //    1.key不存在，直接将key-value存储，并返回null
        //    2.key已经存在，将key值对应的值替换成新值，返回旧值
        map.put("001", new Student("张三", 20));
        map.put("002", new Student("李四", 22));
        map.put("005", new Student("李五", 23));
        map.put("008", new Student("李八", 25));
        map.put("006", new Student("李六", 25));
        System.out.println("返回值1" + map.get("006"));
        Student str = map.put("006", new Student("李七", 25));
        System.out.println("返回值2" + str);

        //3.遍历
        //键值--值
        //Map 严格意义上来讲，不是一个集合，但是它可以返回3个视图
        //3.1 键值视图---Set----------键值集-------keySet()
        //3.2 值试图-----Collection---值集合------values()
        //3.3 键值对试图--Entry--------键值集------EntrySet()
        System.out.println("遍历方法：键视图");
        Set<String> set = map.keySet();
        System.out.println(set);


        System.out.println("遍历方法:值视图");
        Collection<Student> collection = map.values();

        for (Student student :
                collection) {
            System.out.println(student.toString());
        }


        System.out.println("遍历方法：键值对视图");
        for (Map.Entry<String, Student> entry :
                map.entrySet()) {
            System.out.println(String.format("学号：%s   姓名：%s  年龄：%d", entry.getKey(), entry.getValue().name, entry.getValue().age));
        }

        for (String strKey :
                set) {
            System.out.println(String.format("Key's Value =%s", map.get(strKey)));

        }
        //4.删除
        map.remove("001");

        //特殊情况：key是可以Null，value也可以为null 但key不能重复

        //对于自定义类判断相等，equals默认比较的是引用
        //如果需要实现值比较，需要覆写equals方法同时需要浮现hashcode方法
        //计算哈希值时，key。hashCode()
        //在桶内比较某个key值是否存在使用的是key.equals(inputKey)
        //"001":{name:"n1",age:2}
        //"010":{name:"n1",age:2}

    }

}
