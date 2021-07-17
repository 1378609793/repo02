package com.itheima.test.Demo07Thread.Demo03Runnable;

public class RunnableImpl02 implements Runnable{
    public void run() {
        for (int i = 0; i < 80 ; i++) {
            System.out.println("holle"+i);
        }
    }
}
