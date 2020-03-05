package com.zeroten.javales.IO_plus;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;

public class ReadTest {

    public static void main(String[] args) throws Exception {


        ReadTest();

    }

    public static void ReadTest() throws Exception {
        //字符流 Reader是抽象类
        //参数：inputStream in
        //     inputStream in String charSetName //设置字符集
        //一般常用的字符集  GBK/UTF-8/GB2312/IOS-8859-1-->乱码解决方案--保证统一
        //字符串可以指定编码集的编码和解码
        //String s=new String(bytes,"NewCharSetname");

        //长度未知 用LinkedList
        Reader r = new InputStreamReader(new FileInputStream("D:\\杨老师Java\\FileTest\\YearOne\\YearTwo\\StoryTwo.txt"));

        //用泛型强制统一数据类型
        //在泛型当中，基本数据类型的泛型，只能使用包装类
        //LinkedList<Character> cs = new LinkedList<Character>();
        StringBuffer str = new StringBuffer();
        //char是没有-1的。
        int c = -1;
        while ((c = r.read()) != -1) {
            str.append((char) c);
        }
        System.out.println(str.toString());

        r.close();
    }


    public static void BufferReadTest() throws Exception {
        //缓冲默认8192/8K
        //字符流开始，缓冲才有意义
        BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\杨老师Java\\FileTest\\YearOne\\YearTwo\\StoryTwo.txt")));

        StringBuffer str = new StringBuffer();
        String s = "";
        while ((s = r.readLine()) != null) {
            str.append(s + "\r\n");
        }

    }
}
