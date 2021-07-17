package com.itheima.test.Demo07Thread.Demo05WaitAndNotify.WaitAndNotifyTest;

public class DemoTest {
    public static void main(String[] args) {
        Baozi baozi = new Baozi();
        new BaoziPu(baozi).start();
        new ChiHuo(baozi).start();
    }
}
