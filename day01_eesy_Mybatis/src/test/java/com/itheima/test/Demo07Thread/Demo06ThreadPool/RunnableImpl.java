package com.itheima.test.Demo07Thread.Demo06ThreadPool;

public class RunnableImpl  implements  Runnable{
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建了一个新线程");
    }
}
