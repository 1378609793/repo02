package com.itheima.test.Demo07Thread.Demo02Thread;

public class MyThread  extends Thread {


        //重写run方法,设置线程任务(开启线程 做什么)
        public void run(){
     /*      for (int i = 1;i<=30; i++){
               System.out.println("run"+i);
           }*/
          /*  String name = getName();//返回该线程的名称
            System.out.println(name);*/

            /*
            Thread thread = Thread.currentThread();   //获取当前执行的线程
            System.out.println(thread);
            String name = thread.getName();//返回该线程的名称
            System.out.println(name);
*/
            System.out.println(Thread.currentThread().getName());
            for (int i = 1;i<=30; i++){
                System.out.println("run"+i);
            }
        }
    }

