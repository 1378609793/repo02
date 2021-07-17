package com.itheima.test;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int a = 52;
        int b = 363 ;
        int c = 1023;
        int max=b;
     if(max < a){
         max = a;
     }else if(max < c){
         max = c;
     }else if(c > a){
         max = c;
     }
        System.out.println(max);



      int[] arr = {155,22,31,4,50};
        Arrays.sort(arr);
       for(int tmp : arr){
          System.out.println(tmp);
           }
    }

}
