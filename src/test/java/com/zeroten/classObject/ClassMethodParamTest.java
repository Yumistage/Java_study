package com.zeroten.classObject;

import org.junit.Test;

public class ClassMethodParamTest {

    //不能修改基本参数的值
    private void changePrimitive(int numb) {

        System.out.println("修改前:" + numb);
        numb = 20;
        System.out.println("修改后:" + numb);
    }


    @Test
    public void testModifyMethodParam() {
        int numb = 10;
        changePrimitive(numb);
        System.out.println(numb);

        StringBuilder sb = new StringBuilder();
        sb.append("字符串");
        chageReference(sb);
        System.out.println(sb.toString());
    }

    //只能修改引用类型的值 不能修改引用类型的指向
    private void chageReference(StringBuilder sb) {
        System.out.println("传入值：" + sb.toString());
        sb.append("-追加");
        System.out.println("修改后：" + sb.toString());

        sb = new StringBuilder();
        sb.append("新字符串");


    }

    @Test
    public void name() {
    }
}
