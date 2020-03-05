package com.zeroten.javales.IO_plus;

import java.io.*;
import java.util.Objects;

public class WriteTest {

    public static void main(String[] args) throws Exception {

        WriterTest();
    }

    public static void WriterTest() throws Exception {
        Writer w = new OutputStreamWriter(new FileOutputStream(new File("D:\\杨老师Java\\FileTest\\YearOne\\YearTwo\\StoryTwo.txt")));

        w.write("Hello cx");
        w.flush();
        w.close();
    }

    public static void BufferWriteTest() throws Exception {
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("D:\\杨老师Java\\FileTest\\YearOne\\YearTwo\\StoryTwo.txt"))));

        w.write("Hello cx,cxc");
        w.flush();
        w.close();


    }
}
