package com.itheima.test.Demo07Thread.Demo05WaitAndNotify;

public class Demo01WaitAndNotify {
    public static void main(String[] args) {
     /*  final Object obj = new Object();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println("顾客1:老板，给我做一碗牛肉粉丝汤");

                        try {
                            //obj.wait(5000);wait方法如果在毫秒值结束之后还没有被notify 唤醒，就会自动醒来
                            obj.wait(); //调用wait方法放弃cpu执行权，进入无限等待状态
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("顾客1:开吃，香！");
                    }
                }
            }
        }.start();


        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println("顾客2:老板，给我做一碗牛肉粉丝汤");

                        try {
                            //obj.wait(5000);wait方法如果在毫秒值结束之后还没有被notify 唤醒，就会自动醒来
                            obj.wait(); //调用wait方法放弃cpu执行权，进入无限等待状态
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("顾客2:开吃，香！");
                    }
                }
            }
        }.start();

        new Thread() {

            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {

                        System.out.println("告诉顾客已经好了");
                      //  obj.notify();  唤醒在此对象监视器上等待的线程“单个线程”
                        obj.notifyAll(); //唤醒全部线程

                    }
                }
            }

        }.start();*/
        int i = 0 ;
        System.out.println(i);
    }


}
