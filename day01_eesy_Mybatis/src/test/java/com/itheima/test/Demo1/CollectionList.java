package com.itheima.test.Demo1;

import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionList {

    public static void main(String[] args) {
        Collection coll = new ArrayList();
        System.out.println(coll);
        System.out.println("d ");

        coll.add("add");
        System.out.println(coll);
       //  abc();
        boolean b1 =   coll.add("张三");
        if(b1 == true){
            System.out.println("添加成功");
            System.out.println(coll);
        }
        coll.add("李四");

        System.out.println(coll);
        boolean b2 =  coll.remove("zhangsan");
       if(b2 == true){
           System.out.println("删除成功");
       }else {
           System.out.println("删除失败");
       }

      int size =  coll.size();
        System.out.println(size);


       // coll.clear(); //清空集合元素
     /*   int Size =  coll.size();
        System.out.println(Size);*/



    }


    public static void abc() {
//        String a = "abc";
//        String b = "b";
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0) {
//                System.out.println(i+a);
//
//
//            }
//        }
//
        int sum  =  0;
        for(int i =1;i<=9;i++){
            for(int j = 1;j<=i;j++ ){
                sum=i*j;
                System.out.print(i+"*"+j+"="+sum);
            }
            System.out.println();
        }
    }
}




