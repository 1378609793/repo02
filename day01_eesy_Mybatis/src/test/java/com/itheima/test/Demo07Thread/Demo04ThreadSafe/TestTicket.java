package com.itheima.test.Demo07Thread.Demo04ThreadSafe;

public class TestTicket {
    //线程同步不安全的，卖出了重复的票
    public static void main(String[] args) {
        //synchronized测试
 /*       Runnable runnable = new Demo01RunnableImpl();
        Thread thread = new Thread(runnable);
        thread.start();
        Thread thread2 = new Thread(runnable);
        thread2.start();
        Thread thread3 = new Thread(runnable);*/

        //Lock测试
    Runnable runnable1 = new Demo02RunnableImplLock();
    Thread thread1 = new Thread(runnable1);
    thread1.start();
    Thread thread = new Thread(runnable1);
    thread.start();
    }
}
