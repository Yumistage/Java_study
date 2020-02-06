package com.zeroten.javales.Collection;

import com.zeroten.javales.InnerClass.PrintAbstratc;

import java.util.*;

public class ListSimpleUser {

    public  static void PrintAllElemnet(List<String> list)
    {
        //遍历读取
        for (String str :
                list) {
            System.out.println(str);
            ;
        }

        list.forEach(var -> {
                    System.out.println(var);
                }
        );

        //遍历----使用迭代器方法
        System.out.println("迭代器遍历");
        Iterator<String> iterator=list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //删除
        System.out.println("删除元素");
        list.remove("F");
        list.remove("C");

        System.out.println(list);


    }



    public static void main(String[] args) {

        //集合分为两大类
        //1.单个元素的序列。全部都实现了collection接口
        //  1.1 List  列表  有序的，按照插入顺序排序，可以有重复的，可以包含null
        //  1.2 Set   集    不可以有重复元素，可以存入null
        //  1.3 Queue 队列  按一定规则进行添加/删除

        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("C");
        list.add("B");
        list.add("F");

        System.out.println("list的元素个数=" + list.size());

        PrintAllElemnet(list);


        LinkedList<String> list2 = new LinkedList<>();

        list.add("A");
        list.add("C");
        list.add("B");
        list.add("F");
        PrintAllElemnet(list2);

        List list3= new ArrayList();
        list3.add(1);
        list3.add("1");
        list3.add("字符串");
        list3.add(new Date());


        for (int i=0;i<list3.size();i++) {
            Object object = list3.get(i);
            if (object instanceof String)
            {
                System.out.println("字符串是："+(String) object);
            }
            else if (object instanceof Integer)
            {
                System.out.println("字符串是："+(Integer) object);
            }

            else if (object instanceof Date)
            {
                System.out.println("字符串是："+(Date) object);
            }
        }


        //需要进行强制转换，需要提前用instanceof来判断该变量的实际类型




        //2.键值对，全部都实现了Map接口

    }
}
