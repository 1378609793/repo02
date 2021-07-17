package com.itheima.test.Demo07Thread.Demo02Thread;

public class Demo01Thread {
    public static void main(String[] args) {
    MyThread  myThread = new MyThread();
    myThread.start();//开启多线程,开启新的栈空间
        for (int i = 1;i<=30; i++){
            System.out.println("main"+i);
        }
    }
}
