package com.zeroten.javales.Collection;

import java.util.HashMap;
import java.util.Map;

public class MapSimpleUser {

    public static void main(String[] args) {

        //Map 键值对，包括一个key 一个value，通过key可以快速找到value
        //特性：
        //    1）key有唯一性
        //    2）put方法如果key已经存在，那就会使用新value替换旧value，同时返回旧的value
        //    3）key可以是null
        //    4) value可以是null
        //示例：
        //001 -->{学生1：姓名，年龄，地址}
        //002 -->{学生2：姓名，年龄，地址}

        Map<Integer, String> map = new HashMap<>();
        String result1 = map.put(1, "张三，20");
        System.out.println(result1);
        String result2 = map.put(1, "王五，21");
        System.out.println(result2);
        System.out.println(map.put(1, "王五，21"));
        map.put(2, "李四，22");

        System.out.println(map);

        for (Map.Entry<Integer, String> entry :
                map.entrySet()) {
            System.out.println(String.format("当前的key是%d，Value是%s", entry.getKey(), entry.getValue()));

        }

    }

}
