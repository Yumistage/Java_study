package com.zeroten.javales.String;


import org.testng.annotations.Test;

public class StringTest {
    @Test
    public void testName() {
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1 == str2);

        String str3 = new String("Hello world");
        String str4 = str1 + " world";
        System.out.println(str3 == str4);

        String str5 = new String("Hello");
        String str6 = new String("Hello");
        System.out.println(str5 == str6);

        String str7 = str6.intern();
        System.out.println(str1 == str7);
    }

    @Test
    public void testLength() {
        String str1 = "hello,\uD835\uDD5D\uD835\uDD60\uD835\uDD60\uD835\uDD5C";
        System.out.println(str1);
        System.out.println(str1.length());
        //计算实际字符串的代码点数（字符串的实际点数）
        System.out.println(str1.codePointCount(0, str1.length()));
    }

    @Test
    public void test子串截取() {
        String str1 = "Hello,china";
        String str2 = str1.substring(6, str1.length());
        System.out.println(str2);
    }

    @Test
    public void testFormat() {
        String str1 = "大写a: " + "A" + " " + "\n";
        System.out.println(str1);
        String str2 = String.format("大写a: %c,它的ASCII码是%d %n", 'A', (int) 'A');
        System.out.println(str2);
    }

    @Test
    public void testCompare() {

        String str1 = "Hello";
        String str2 = "hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }

    @Test
    public void testFind() {
        String str1 = "Hello";

        System.out.println(str1.indexOf('H'));
        System.out.println(str1.indexOf('o'));
        System.out.println(str1.lastIndexOf('o'));
        System.out.println(str1.lastIndexOf('H'));
        //没有的字符，值为-1
        System.out.println(str1.indexOf('z'));

        str1="hello,my name is tom";
        int index = -1;
        do {
            int at1 = str1.indexOf("o", index + 1);
            if (at1 == -1) {
                break;
            }
            System.out.println(String.format("第%d是小写字母o", at1 + 1));
            index = at1;
        }
        while (true);
    }


    @Test
    public void testReplace() {
        System.out.println("Hello".replace('o','O'));
        System.out.println("Hello".replace("l","L"));
    }

    @Test
    public void testRemovePlace() {
        String str1="   hello";
        System.out.println(str1.trim());
        System.out.println(str1.trim().toUpperCase());
        System.out.println(str1.trim().toLowerCase());
        str1="";
        System.out.println(str1);
        str1=null;
        System.out.println(str1);

    }
}