package com.zeroten.fow.day_2020_1_2;

import org.testng.annotations.Test;

import java.util.Random;

public class IfElseTest {
    @Test
    public void testIfElse() {

        int age = 7;
        if (age < 7) {
            System.out.println(age + "岁，属于儿童");
        } else if (age < 18) {
            System.out.println(age + "岁，属于少年");
        } else if (age < 41) {
            System.out.println(age + "岁，属于青年");
        } else if (age < 60) {
            System.out.println(age + "岁，属于中年");
        } else {
            System.out.println(age + "岁，属于老年");
        }


    }

    @Test
    public void testWhile() {

        boolean isContinue = true;
        int times = 0;
        while (isContinue) {
            int r = new Random().nextInt(1000);
            if (r % 30 == 0) {
                System.out.println("随机数：" + r + "被整除，循环结束");
                System.out.println("已执行" + times + "次");

                isContinue = false;

            } else {
                System.out.println("随机数：" + r + "不被整除，循环继续");
                times++;
            }

        }
    }

    @Test
    public void testdoWhile() {
        boolean isContinue = true;
        int times = 0;
        do {
            int r = new Random().nextInt(1000);
            if (r % 30 == 0) {
                System.out.println("随机数：" + r + "被整除，循环结束");
                isContinue = false;
            } else {
                System.out.println("随机数：" + r + "不被整除，循环继续");
                times++;
            }

        }
        while (isContinue);

        System.out.println("随机产生了" + times + "个不能被30整除的数");

    }

    @Test
    public void testFor() {
        int total = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "是双数");
            } else {
                total++;
                System.out.println(i + "是单数");
                System.out.println(i + "是第" + total + "单数");
            }
        }
        System.out.println("总共有" + total + "个单数");
    }


}
