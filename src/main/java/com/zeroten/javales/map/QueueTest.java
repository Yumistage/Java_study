package com.zeroten.javales.map;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    //队列 Queue
    //    队列指的是一种在队尾插入元素，在队头删除元素
    //    双端队列：可以在队头和队尾进行元素的插入和删除操作
    //队列特点：只能对队头或队尾元素进行操作，不能对队列中的元素进行操作
    //       先进先出FIFO
    //       先进后出(栈结构)
    //队列的接口：Queue\Deque
    //队列的实现类
    // 1.LinkList 具有队列、双端队列的功能.内部使用链表来实现
    // 2.ArrayDeque 具有队列和双端队列功能 内部使用循环数组实现
    // 3.PriorityQueue 优先级队列：把最小的元素单独拿出来，典型应用场景：
    //两个应用场景：任务调度，LRU（最新最少使用）
    //两个工具：Arrays Collections

    public static void main(String[] args) {

        //队列
        // testQueueOp();

        //双端队列
        //testDeQueup();

        //优先级队列：任务调度
        //内部特点：内部使用了一种堆的数据结构，他是一个自我调整的二叉树
        //        当添加删除元素时，他能快速的找到队列中最小的元素，
        //        并且移动到树的根部，而不用对所有元素进行排序
        //对优先级队列进行遍历时，他是无序的
        testPriortyQueue();
    }

    private static void testQueueOp() {
        //队列
        //Queue 接口的方法
        Queue<String> queue = new LinkedList();
        //增删查改
        //add(E)/off(E)
        //在队列未满的情况下，添加元素到队列的尾部。
        //增
        //如果队列已满：add  抛异常  IllegalStateException
        //           offer 不抛异常 return false；
        //如果使用remove 来获取队尾元素时，remove钱需要破案段队列是否是空
        //queue.size（）==0或者 queue.isEmpty()
        //如果使用poll来获取队尾元素时，获取到结果后，先判断结果是否为null
        queue.add("str1");
        queue.add("str3");
        queue.add("str2");
        queue.add("str4");
        //删
        //remove/poll
        //如果队列不为空，删除并返回队头的元素
        //如果队列为空，remove 抛异常 NoSuchElementException
        //            poll   返回null
//        System.out.println("remove:"+queue.remove());
//        System.out.println(queue);
//        System.out.println("remove:"+queue.remove());
//        System.out.println(queue);
//        System.out.println("remove:"+queue.remove());
//        System.out.println(queue);
//        System.out.println("remove:"+queue.remove());
//        System.out.println(queue);
//        System.out.println("poll:"+queue.poll());
        //查，仅查看队头元素是什么，不删除
        //element/peek
        //如果队列不为空，返回队列的头部元素，但不删除
        //当队列为空时，element 抛异常 NosuchElementException
        //           peek 返回null
        //使用element 方法判断队列是否为空
        //使用peek方法后，先判断返回结果是否为null
        System.out.println(queue);
        queue.clear();
        System.out.println("队头元素：" + queue.element());
        System.out.println("队头元素：" + queue.peek());

        //改，一般没有修改操作
    }

    private static void testDeQueup() {
        //双端队列 Deque：增删查改
        Deque<String> deque = new LinkedList<>();

        //增：    add/offer
        //       addFirst/addLast/offerFirst/offerLast
        //删除：  remove/poll
        //       removeFirst/removeLast/pollFirst/pollLast
        //查：    element/peek
        //       getFirst/getLast/peekFirst/peekLast

        deque.addLast("str3");
        deque.addLast("str2");
        deque.addFirst("str1");
        deque.addFirst("str4");
        System.out.println(deque);
        while (deque.pollFirst() != null) {
            System.out.println(deque.pollFirst());
            System.out.println(deque);
        }

    }

    private static void testPriortyQueue() {
        PriorityQueue<String> pq = new PriorityQueue();
        pq.add("1");
        pq.add("3");
        pq.add("5");
        pq.add("7");
        pq.add("2");
        pq.add("4");
        pq.add("6");
        pq.add("8");

        //数组或者实现了Iterable的类可以使用foreach语法
        System.out.println(pq);
        for (String str :
                pq) {
            System.out.println(str);
        }

        //remove 删除并返回队列中最小的元素
        //如果队列为空则抛NOSuchElementException异常
        //在使用remove之前判断当前队列是否为空

        //TreeMap 在构建时，指定Compatator
        //        如果构建是未指定Compatator，key值对象必须实现Comparable接口
        //Comparable与Compatator的区别
        //前者是比较自身和另外一个对象 使用 CompareTo
        //后者是比较传入的两个对象使用 Compare


        //优先级队列如何找最小元素：构建时指定Compatator，或者存放的元素类型实现Compatator接口

        //aaa


    }
}
