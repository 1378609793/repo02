package com.itheima.test.Demo07Thread.Demo03Runnable;

public class RunnableImpl  implements  Runnable{
    public void run() {
        for (int i =1;i<=80; i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
