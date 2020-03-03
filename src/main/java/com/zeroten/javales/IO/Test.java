package com.zeroten.javales.IO;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1.查看目录\n2.查看文件\n3.增加文件");
        System.out.println("请输入选项：");

        System.out.println(s.next());
    }
}
