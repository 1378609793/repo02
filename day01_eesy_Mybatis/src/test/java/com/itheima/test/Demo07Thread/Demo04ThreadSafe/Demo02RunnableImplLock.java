package com.itheima.test.Demo07Thread.Demo04ThreadSafe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo02RunnableImplLock implements Runnable {
    private int ticket = 100;

    Lock  L = new ReentrantLock();
    /*
    public void run() {
        while (true){
            L.lock();
            if (ticket > 0){
                try {
                    Thread.sleep(10);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
                    ticket--;

            }
            L.unlock();//调用方法释放锁

        }
*/



    public void run() {
        while (true) {
            L.lock();//调用方法获取锁
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    L.unlock();//无论程序是否异常，都要去释放锁,可以提升效率
                }

            }

        }

    }
}