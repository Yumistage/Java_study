package com.zeroten.javales.InnerClass;

//外部类
public class OuterClass {

    private Integer index;
    private String name;

    public OuterClass(Integer index, String name) {
        this.index = index;
        this.name = name;
    }

    //内部类：定义在其他类中的类，称为内部类
    public class InnerClass {

        private String name;

        public InnerClass(String name) {
            this.name = name;
        }

        void print() {
//            //使用局部内部类
//            class printClass {
//                void Print1() {
//
//                    StringBuilder tmp = new StringBuilder();
//                    tmp.append("外围类index=");
//                    tmp.append(index);
//                    tmp.append("外围类的name=");
//                    tmp.append(OuterClass.this.name);
//                    System.out.println(tmp.toString());
//                }
//            }
//            new printClass().Print1();

            //匿名内部类
//            new PrintInterface() {
//
//                @Override
//                public void print() {
//
//                }
//            }.print();

            //内部类---实现接口
//            class PrintInterfaceImpl implements PrintInterface {
//
//                @Override
//                public void print() {
//
//                }
//            }
//
//            new PrintInterfaceImpl().print();

            //内部类---实现抽象类
            //  方法1
//            class PrintInterfaceImpl extends PrintAbstratc{
//
//                @Override
//                void print() {
//
//                }
//            }
//            new PrintInterfaceImpl().print();
//
//            //方法2
//            new PrintAbstratc() {
//
//                @Override
//                void print() {
//
//                }
//            }.print();
        }

    }


//    public static void main(String[] args) {
//        OuterClass out = new OuterClass(1, "外部类");
//        OuterClass.InnerClass inner = out.new InnerClass("内部类");
//    }


}



