package com.zeroten.classObject;

import org.testng.annotations.Test;

public class VarTest {

    //用于记录创建的实例的个数
    public static int count = 0;

    public int index;

    public static void main(String[] args) {

        VarTest v1 = new VarTest();
        v1.index = 1;
        VarTest.count++;
        System.out.println(String.format("当前创建第%d个实例", VarTest.count));
        VarTest v2 = new VarTest();
        v2.index = 2;
        VarTest.count++;
        System.out.println(String.format("当前创建第%d个实例", VarTest.count));

    }
}
