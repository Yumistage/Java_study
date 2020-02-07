package com.zeroten.javales.list;

import jdk.nashorn.internal.ir.LiteralNode;

import java.util.*;

public class ListStudy {

    //List主要有两种 ArrayList 和LinkedList
    //ArrayList:内部是使用数组来实现的
    //LinkedList：内部使用的是一个双向链表来实现
    //创建：无参数构建：
    //     有参数构造：1.指定容量大小
    //               2.复制已存在的List来创建
    //添加： 1.头插
    //      2.尾插
    //      3.中间插入
    //删除： 1.头删
    //      2.尾删
    //      3.中间删除
    //遍历
    //      1.使用For循环
    //      2.使用迭代器 Iterator，ListInterator
    //      3.使用迭代器对List进行添加和删除操作
    //      4.迭代器使用的注意事项：
    //        在使用迭代器对列表进行操作时，原对象不能发生结构性变化（大小，长度不能改变）modCount来实现
    //        如果modCount发生变化（增加/删除元素）。需要重新获取迭代器
    //
    //底层实现原理及主要JDK源码：内部存储结构、添加/删除/遍历操作的流程
    //对List进行排序:冒泡、插入、选择

    private static void addNumerToList(List<Integer> list, int count, int numer) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            list.add(numer);
        }
        long end = System.currentTimeMillis();

        System.out.println("耗时：" + (end - start) + "ms");
    }


    private static void StudyArrayListOp() {
        //创建Arraylist时，如果未指定容量大小时，默认数组的长度为0
        //第一次调用add方法时，会将容量扩充为默认容量大小10

        int count = 1000000;

        //创建方法1
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(0, 20);
        System.out.println(list);
        //改变原来位置的值
        list.set(0, -1);
        System.out.println(list);

        //删除
        list.remove(0);
        System.out.println(list);

        //遍历
        System.out.println("遍历数组方法1");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("遍历数组方法2");
        for (Integer i :
                list) {
            System.out.println(i);
        }

        System.out.println("遍历数组方法3");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("遍历数组方法4");
        ListIterator iterator2 = list.listIterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.previous());
        }
        //创建方法2---传入容量
        List<Integer> List2 = new ArrayList<>(count);
        //数组时有容量大小限制的，当add 操作时，如果数组已满，引发扩容
        //1.计算新的容量大小:原来的1.5倍
        //2.按照新的容量创建一个新的数组
        //3.将旧的数组里面的元素全部复制到新的数组
        //4.丢弃旧的数组

        //创建方法3---传入也有list
        List<Integer> list3 = new ArrayList<>(list);


    }

    private static void listIterator() {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        Iterator iterator = list.iterator();

        ListIterator listIterator = list.listIterator();

        System.out.println("has previous:" + listIterator.hasPrevious());

        System.out.println("has next:" + listIterator.hasNext());

        System.out.println("previous:" + listIterator.previousIndex());

        System.out.println("next:" + listIterator.nextIndex());

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("has previous:" + listIterator.hasPrevious());

        System.out.println("has next:" + listIterator.hasNext());

        System.out.println("previous:" + listIterator.previousIndex());

        System.out.println("next:" + listIterator.nextIndex());

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }


    }


    private static void StudyLinkedList() {
        //创建时，没有大小限制
        //创建方式1
        System.out.println("创建方法1");
        List list1 = new LinkedList();
        list1.add("A");
        list1.add("B");
        System.out.println(list1);

        System.out.println("创建方法2");
        //创建方式2
        List list2 = new LinkedList(list1);

        System.out.println(list2);

        //其余操作和Arraylist一致

    }

    private static void ListOpTime(List<Integer> list) {

        int iTimes=100000;
        //for循环遍历
        //LinkedList每次都会从头开始查找，所以耗时比较大
        //优化：当i>length/2时，linkedList会从尾部开始找
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        System.out.printf("[%s] for循环耗时：%d \n", list.getClass().getSimpleName(), System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }

        System.out.printf("[%s] 迭代器循环耗时：%d \n", list.getClass().getSimpleName(), System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        for (Integer n :
                list) {
        }

        System.out.printf("[%s] foreach循环耗时：%d\n", list.getClass().getSimpleName(), System.currentTimeMillis() - start);


        //在第5位插入 10000个1
        start = System.currentTimeMillis();
        for (int i = 0; i < iTimes; i++) {
            list.add(4, 1);
        }
        System.out.printf("[%s] 第5位插入值耗时：%d\n", list.getClass().getSimpleName(), System.currentTimeMillis() - start);

        //在末位插入10000个2
        start = System.currentTimeMillis();
        for (int i = 0; i < iTimes; i++) {
            list.add(2);
        }
        System.out.printf("[%s] 某位插入值耗时：%d\n", list.getClass().getSimpleName(), System.currentTimeMillis() - start);


    }


    public static void main(String[] args) {

        //StudyArrayListOp();

        //listIterator();

        // StudyLinkedList();

        //ArrayList和LinkedList区别
        //ArrayList 擅长随即快速访问，而从列表中间删除/插入元素很慢
        //LinkedList 擅长从列表中间删除/插入元素，而随机访问很慢
        //随机访问：list.get(index) 通过索引来访问


        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        ListOpTime(list1);

        List<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        ListOpTime(list2);
    }


}
