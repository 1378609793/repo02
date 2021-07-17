package com.itheima.test.Demo08File.Demo02Recursion;

public class demo02Recurison {
    public static void main(String[] args) {
        int sum = sum(100);
        System.out.println(sum);
        int sum1 = jn(10);
        System.out.println(sum1);
    }

    //求1~n之间的和
    public static int sum(int n) {

        if (n == 1) {
            return 1;
        }

        return n + sum(n - 1);

    }
    //求1~n之间的阶乘
    public static int jn(int n) {

        if (n == 1) {
            return 1;
        }

        return n * jn(n - 1);

    }
}