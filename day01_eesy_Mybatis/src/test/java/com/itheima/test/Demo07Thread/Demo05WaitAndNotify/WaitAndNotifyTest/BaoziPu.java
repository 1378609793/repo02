package com.itheima.test.Demo07Thread.Demo05WaitAndNotify.WaitAndNotifyTest;

public class BaoziPu extends Thread {
    Baozi baozi = new Baozi();

public BaoziPu(Baozi baozi){
    this.baozi=baozi;
}
    @Override
    public void run() {

        while (true) {
            synchronized (baozi) {
                if (baozi.falg == true) {
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒以后包子铺生产包子
                    baozi.pi = "薄皮";
                    baozi.xian = "牛肉大葱馅";
                System.out.println("包子铺正在生产"+baozi.pi+baozi.xian+"包子");
                //生产包子需要3秒
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                baozi.falg = true;//已经有包子
                //唤醒吃货线程吃包子
                baozi.notify();
                System.out.println("已经生产好了"+baozi.pi+baozi.xian+"吃货们可以吃了");
            }
         }
    }
}

