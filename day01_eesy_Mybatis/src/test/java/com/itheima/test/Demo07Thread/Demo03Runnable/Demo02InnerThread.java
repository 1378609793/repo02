package com.itheima.test.Demo07Thread.Demo03Runnable;

public class Demo02InnerThread {
//匿名内部类实现线程方式
    public static void main(String[] args) {
        new Thread(){

            @Override
            public void run() {
                for (int i = 0; i < 30; i++) {
                    System.out.println(Thread.currentThread().getName()+i);
                }
            }
        }.start();

       Runnable r = new Runnable(){
           public void run() {
               for (int i = 0; i < 30; i++) {
                   System.out.println(Thread.currentThread().getName()+i);
               }
           }
       };
       new Thread(r).start();
       new Thread(new Runnable() {
           public void run() {
               for (int i = 0; i <30 ; i++) {
                   System.out.println(Thread.currentThread().getName()+i);
               }
           }
       }).start();
    }
}
