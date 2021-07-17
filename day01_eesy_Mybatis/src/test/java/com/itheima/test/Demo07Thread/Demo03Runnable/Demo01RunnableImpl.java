package com.itheima.test.Demo07Thread.Demo03Runnable;

public class Demo01RunnableImpl {
    public static void main(String[] args) {
        Runnable r = new RunnableImpl();
        Thread thread = new Thread(r);
        thread.start();

        Runnable r2 = new RunnableImpl();
        Thread thread2 = new Thread(r2);
        thread2.start();


        Runnable r1 = new RunnableImpl();
        System.out.println(r1);

    }
}
