package com.itheima.test.Demo08File.Demo02Recursion;

import com.sun.org.apache.regexp.internal.RE;

public class demo01Recurison {
    //递归就是方法自己调用自己
    //直接递归与间接递归 a(){a()};   a()调用b()b在调用a()
    //构造方法禁止递归
    public static void main(String[] args) {
a(1);
//a2(1);

    }
    public static   void a(int i){
        System.out.println(i);
        if(i==10){   //在递归中虽然有限定条件，但是递归次数不能太多,否则也会栈溢出
            a(++i);
            return;  //结束方法
        }
            a(+  +i);

        }
        public static  void  a2(int i){

        int sum = 0;
        System.out.println(sum);
        if(i==100){
            return;
        }else {
            sum+=sum+i;
            a2(++i);

        }



        }

    /*public static  void a(int i){
        System.out.println(i);
        if(i == 22000){
            return;
        }else{
            a(++i);
        }
    }
    public  static  void a2(int i){
        System.out.println(i);
        if(i <= 20000){
            a2(++i);
        }else {
            return;
        }
    }*/

    }


