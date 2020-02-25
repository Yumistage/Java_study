package com.zeroten.javales.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUTest {

    public static void main(String[] args) {
        //LRU:Least Recently Used ,最近最少使用
        //缓存：缓存热点数组，经常使用的数据
        //缓存的一种淘汰算法
        //当缓存已满时，再向缓存内添加内容时，
        //删除（淘汰）缓存中已存在元素最近最少被使用的那个

        //LinkedHashMap 支持LRU算法
        //LinkedHashMap 具有HashMap的所有功能+可保持插入顺序（遍历）
        //HashMap+双向链表
        //增加了head/tail，after/before
        //LinkedHashMap是有序的 bool accessOrder
        //1.按照插入顺序accessOrder=false：每次插入元素，将元素放到双向列表的末尾
        //2.访问顺序accessOrder=true:每次插入元素/获取元素，将插入的元素/访问的元素放到双向链表的末尾
        // 1 3 5 7 2 3 6
        //put/get 会将元素移动到末尾
        //最少访问的元素都会出现在队列的最前面
        //按照1还是2进行排序
        LRU<String, String> lru = new LRU<>();
        lru.put("001", "张2");
        lru.put("002", "张3");
        lru.put("003", "张4");
        lru.put("004", "张5");
        lru.put("005", "张6");

        System.out.println(lru);
        lru.put("006","张7");
        System.out.println(lru);

    }

    static class LRU<K, V> extends LinkedHashMap<K, V> implements Map<K, V> {
        private int macCount = 5;

        public LRU() {
            super(10, 0.75F, true);
        }

        //参数:eldest 最新最少使用的元素
        //当调用put方法时,并且key值不存在时，调用
        @Override
        protected boolean removeEldestEntry(Entry<K, V> eldest) {
            boolean remove = size() > macCount;
            if (remove) {
                System.out.println("淘汰最近最少使用的元素：" + eldest);
            }
            return remove;
        }
    }

}
