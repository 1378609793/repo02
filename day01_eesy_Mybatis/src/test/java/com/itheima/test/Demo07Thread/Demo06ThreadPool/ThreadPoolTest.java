package com.itheima.test.Demo07Thread.Demo06ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Executors  线程池的工厂类，用来生产线程池 ,用  ExecutorService接口接收实现类对象(面向接口编程)
public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService eService = Executors.newFixedThreadPool(2);

        //调用 ExecutorService接口中的方法submit,传递线程任务（实现类）,开启线程，执行run方法
        eService.submit(new RunnableImpl());
        eService.submit(new RunnableImpl());
        eService.submit(new RunnableImpl());
       /* 线程池会一直开启，使用完了线程会自动归还，可重复使用
        调用 ExecutorService接口中的方法shutdown销毁线程池*/
        eService.shutdown();
    }


}
