package com.zeroten.javales.map;

import java.util.Deque;
import java.util.LinkedList;
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
        testQueueOp();

        //双端队列
        testDeQueup();
    }

    private  static void testQueueOp(){
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
        System.out.println("队头元素："+queue.element());
        System.out.println("队头元素："+queue.peek());

        //改，一般没有修改操作
    }

    private  static void testDeQueup(){
        //双端队列 Deque：增删查改
        Deque<String> deque=new LinkedList<>();

        //增：    add/offer
        //       addFirst/addLast/offerFirst/offerLast
        //删除：  remove/poll
        //       removeFirst/removeLast/pollFirst/pollLast
        //查：    element/peek
        //       getFirst/getLast/peekFirst/peekLast
    }
}
