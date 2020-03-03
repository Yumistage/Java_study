package com.zeroten.javales.IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamTest2 {

    public static void main(String[] args) throws Exception {
        //使用流操作文件
        String strFile = "D:/杨老师Java/FileTest/YearOne/YearTwo/StoryTwo.txt";

        long len1 = new File(strFile).length();

        String str = "那一年";
        //输出流，是覆盖原文件里面的内容，不是追加
        OutputStream output = new FileOutputStream(strFile);

        //步骤1：获取字节码
        byte[] bytes = str.getBytes();

        for (byte b :
                bytes) {
            output.write(b);
        }

        //把缓冲区的数据推送到输出流里
        output.flush();
        output.close();

    }
}
