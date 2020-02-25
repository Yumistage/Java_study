package com.zeroten.javales.IO;

import java.io.File;
import java.io.IOException;

public class IOTest {

    public static void main(String[] args) throws Exception {
        //在创建File对象时，就是一个对象，没有读取文件，也不会去验证
        //File f1 = new File("文件全路径");
        //File f2 = new File("文件路径", "文件名");
        //路径
        //在windows当中：\\
        //在Linux当中：/
        CreateDir();

        CreateFile();

        IsFileOrDir();

        GetFileLength();

    }

    //创建目录
    private static void CreateDir() {
        File f = new File("D:/杨老师Java/FileTest/YearOne/YearTwo");

        //判断文件或者目录是否存在
        if (!f.exists()) {
            f.mkdir();//创建目录，不创建副目录
            f.mkdirs();//创建目录，不会创建不存在的副目录
        }
    }

    //创建文件
    private static void CreateFile() throws Exception {
        File f = new File("D:/杨老师Java/FileTest/YearOne/YearTwo", "StoryTwo.txt");
        if (!f.exists()) {
            f.createNewFile();
        }
    }

    //判断是文件还是目录
    private static void IsFileOrDir() {
        File f1 = new File("D:/杨老师Java/FileTest/YearOne/YearTwo");
        File f2 = new File("D:/杨老师Java/FileTest/YearOne/YearTwo", "StoryTwo.txt");

        System.out.println(String.format("f1 is File : %b ,is Dir :%b ", f1.isFile(), f1.isDirectory()));

        System.out.println(String.format("f2 is File : %b ,is Dir :%b ", f2.isFile(), f2.isDirectory()));
    }


    private  static void GetFileLength(){
        File f1 = new File("D:/杨老师Java/FileTest/YearOne/YearTwo");
        File f2 = new File("D:/杨老师Java/FileTest/YearOne/YearTwo", "StoryTwo.txt");

        System.out.println(f1.length());//获取的是文件的字节长度，目录的话是0
        System.out.println(f2.length());
       //通常是需要找到在容器中的位置，在web当中有专门的方法

    }



}
