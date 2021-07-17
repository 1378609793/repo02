package com.itheima.test.Demo07Thread.Demo07Lambda;

public class Demo02Lambda {
    public static void main(String[] args) {
        //使用Lambda表达式实现多线程
        new Thread( (/*代表run方法参数列表*/) -> {
            /*->的意思把参数传递给方法体*/
            System.out.println(Thread.currentThread().getName());
            }
        ).start();


    }
}
