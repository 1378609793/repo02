package com.itheima.test.Demo07Thread.Demo07Lambda.Demo01LambdaTest;

public class CookTest {
    public static void main(String[] args) {
   invokeCook( new Cook(){
       @Override
       public void makeFood() {
           System.out.println("吃饭了");
       }
   });

      invokeCook(()->{
            System.out.println("吃饭了");
        }
        );

        //优化Lambda表达式实现多线程
        invokeCook(()->System.out.println("吃饭了"));
    }


    public static void  invokeCook(Cook cook){
        cook.makeFood();
    }
}
