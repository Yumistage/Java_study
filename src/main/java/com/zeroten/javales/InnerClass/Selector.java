package com.zeroten.javales.InnerClass;

public interface Selector {


//我们来看⼀个内部类应⽤示例：有⼀个固定⼤⼩的 Object 数组，以类的形式包装起来类；通过⽅法 add 向序 列末尾添加新的 Object。要获取数组中的每⼀个元素对象，使⽤ Selector 接⼝。Selector 接⼝有如下3个⽅ 法：
//
//        1.end()检查序列是否到末尾
//        2.current()返回当前对象
//        3.next()移动到序列的下⼀个对象{
//        }

    boolean end();

    Object current();

    void next();


}