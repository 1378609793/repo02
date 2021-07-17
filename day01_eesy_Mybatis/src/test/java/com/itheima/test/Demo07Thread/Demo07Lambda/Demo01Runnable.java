package com.itheima.test.Demo07Thread.Demo07Lambda;

public class Demo01Runnable {
    public static void main(String[] args) {
        Runnable runnable = new RunnableImpl();
        Thread thread = new Thread(runnable);
        thread.start();
        //简化代码,使用匿名内部类,实现多线程程序
        Runnable r =new Runnable(){
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建");
            }
        };
        new  Thread(r).start();

        //简化代码
        new  Thread(new Runnable() {
         public void run() {

             System.out.println(Thread.currentThread().getName()+"新线程创建");
         }
     }).start();


    }
}
