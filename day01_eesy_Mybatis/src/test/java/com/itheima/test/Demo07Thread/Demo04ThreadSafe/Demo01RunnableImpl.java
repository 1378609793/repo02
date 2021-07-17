package com.itheima.test.Demo07Thread.Demo04ThreadSafe;

public class Demo01RunnableImpl implements Runnable{
    private  int ticket = 100;

   /* public void run() {

          //线程同步不安全的，卖出了重复的票
        while (true) {

            if (ticket > 0) {

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }*/

    //解决方法01使用Synchronized同步代码块
   // Object o = new Object(); //创建一个锁对象，可以任意类型

  /* public void run() {



       while (true) {
           synchronized (o) {


               if (ticket > 0) {
                   try {
                       Thread.sleep(10);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                   ticket--;
               }
           }
       }
   }*/
    //解决方法02使用Synchronized修饰的同步方法
//设置线程任务 卖票
    public void run() {
           while (true){
                 payTicket();
             }
    }

    public synchronized void payTicket(){   //该方法的锁对象是本类的对象,通过this获取

        if(ticket > 0){

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"当前正在卖第"+ticket+"张票");
            ticket--;

        }

    }
}
