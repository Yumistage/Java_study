package com.zeroten.javales.IO;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class InputStreamTest {

    public static void main(String[] args) throws Exception {

        //以当前程序为参照，从程序外读的数据，称之为输入流
        //以当前程序为参照，往程序外的文件写数据，称之为输出流

        //使用流操作文件
        String strFile = "D:/杨老师Java/FileTest/YearOne/YearTwo/StoryTwo.txt";

        //读文件的大小（字节）
        long len1 = new File(strFile).length();

        //注意，这只是一个demo
        //目的：明白字节流的方法
        InputStream input = new FileInputStream(new File(strFile));
        int len2 = input.available();

        //java中默认是int，所以long需要强转 所以使用len2
        //用于保存，读取的文件数据
        //由于len2是int 超过int的最大值 就会导致内存溢出，系统崩溃
        //
        byte[] bs = new byte[len2];

        //输入流将直接写入内存地址 写入方式比较粗暴
        input.read(bs);

        String str = new String(bs);
        System.out.println(str);

        input.close();

    }


}
