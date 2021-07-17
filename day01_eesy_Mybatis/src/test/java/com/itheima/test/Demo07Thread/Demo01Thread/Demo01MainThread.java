package com.itheima.test.Demo07Thread.Demo01Thread;

public class  Demo01MainThread {
    public static void main(String[] args) {

        Person person =new Person("小强");
        person.show01();
        Person person2 =new Person("旺财");
        person2.show01();
        for (int i = 1;i<=30; i++){
            System.out.println("main"+i);
        }
    }
}
