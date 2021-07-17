package com.itheima.test.Demo02List;

import java.util.LinkedList;
import java.util.List;
//Linkedlist是链表结构，插入删除较快，查询较慢
public class Demo02Linked {
    public static void main(String[] args) {
        LinkedList<String> Linkedlist = new LinkedList<String>();
        Linkedlist.add("a");
        Linkedlist.add("b");
        System.out.println(Linkedlist);
        Linkedlist.addFirst("马里奥");
        System.out.println(Linkedlist);
    }
}
