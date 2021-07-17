package com.itheima.test.Demo07Thread.Demo07Lambda;

public class RunnableImpl implements Runnable{
    public void run() {
        System.out.println(Thread.currentThread().getName()+"新线程创建");
    }
}
