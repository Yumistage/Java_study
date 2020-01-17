package com.zeroten.fow.day_2020_1_3;

import org.testng.annotations.Test;

public class Test_1_3_String {
    //使用赋值形式的字符串，JVM先去常量池中检测是否存在，存在则直接引用，不存在则创建并返回
    //使用new形式的字符串。则直接创建并返回。String中提供了inern（）方法，调用该方法的时
    //JVM去字符串常量池检测是否存在该字符串，如果已经存在则直接引用；不存在则再常量池中创建
    //并引用

    @Test
    public void testString() {
        String str1="hello";
        String str2="hello";
        System.out.println(str1==str2);
        String str3=new String("hello");
        System.out.println(str1==str3);
        String str4="hello world";
        String str5=str1+" world";
        System.out.println(str4==str5);

        System.out.println(str1.compareTo(str3));
        System.out.println(str1.equals(str3));

        String str8=new String("Hello").intern();



    }
}
