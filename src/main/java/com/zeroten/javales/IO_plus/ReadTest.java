package com.zeroten.javales.IO_plus;

import java.io.*;

public class ReadTest {

    public static void main(String[] args) throws Exception {
        //字符流 Reader是抽象类
        //参数：inputStream in
        //     inputStream in String charSetName //设置字符集
        //一般常用的字符集  GBK/UTF-8/GB2312/IOS-8859-1-->乱码解决方案--保证统一
        //字符串可以指定编码集的编码和解码
        //String s=new String(bytes,"NewCharSetname");

        //长度未知 用LinkedList
        Reader r = new InputStreamReader(new FileInputStream("D:\\杨老师Java\\FileTest\\YearOne\\YearTwo\\StoryTwo.txt"));

        char c = (char) -1;
        while ((c = (char) r.read()) != -1) {

        }


    }
}
