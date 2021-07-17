package com.itheima.test.Demo03Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo03LinKedHashSet {
    public  int i;
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("www");
        hashSet.add("abc");
        hashSet.add("abc");
        hashSet.add("abcd");
        System.out.println(hashSet);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("abc");
        linkedHashSet.add("www");
        linkedHashSet.add("abcd");
        linkedHashSet.add("abc");
        System.out.println(linkedHashSet);

int i = VarArgs(5,5,5,5,5);
        System.out.println(i);


    }
    //可变参数：当参数列表数据类型确定 个数不确定时，就可以使用可变参数，底层时数组
    public static  int  VarArgs(int... a ){
     int sum = 0;
        for(int i:a){
            sum += i;
        }
        return sum;


    }

    public static class Person extends Object {
        @Override
        public int hashCode() {
            return 1;
        }
    }
}
