package com.itheima.test.Demo07Thread.Demo05WaitAndNotify.WaitAndNotifyTest;

public class ChiHuo  extends Thread{

    Baozi baozi = new Baozi();
    public ChiHuo (Baozi baozi){
        this.baozi=baozi;
    }
    @Override
    public void run() {

        while (true) {
            synchronized (baozi) {
                if (baozi.falg == false) {
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("在吃"+baozi.pi+baozi.xian+"包子");
                baozi.falg=false;//修改状态为false

                //唤醒包子铺生产
                baozi.notify();
                System.out.println("吃货已经吃完了，包子铺生产包子了");
                System.out.println("------------------------------");
            }
        }
    }
}

