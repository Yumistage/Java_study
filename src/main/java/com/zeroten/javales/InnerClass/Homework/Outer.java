package com.zeroten.javales.InnerClass.Homework;

public class Outer {


    static print create() {
        return new print();
    }

    static class print implements Inter {

        @Override
        public void show() {
            System.out.println("hello word");
        }
    }

    interface Inter {
        void show();
    }

    // TODO: 补全代码

    public static void main(String[] args) {
        Outer.create().show();
    }
}
