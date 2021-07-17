package com.itheima.test.Demo07Thread.Demo02Thread;

public class Demo02Thread {
//线程名称
    //主线程:main
    //新线程：thread0 ,Thread1,Thread2,Thread3
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        MyThread myThread1 = new MyThread();
        myThread1.start();
      //  System.out.println(Thread.currentThread().getName());
    }
}
