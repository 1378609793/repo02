package com.itheima.test.Demo1;

import javax.swing.tree.VariableHeightLayoutCache;
import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
      Show01();

      Show02();


    }
    public  static  void Show01(){
        ArrayList arrayList = new ArrayList();
        arrayList.add("里斯");
        arrayList.add("马克6");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            Object obj =  iterator.next();
            System.out.println(obj);

            String s = (String)obj;
            System.out.println( s.length());
        }

    }
    public  static  void Show02(){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("亚历山大");
        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()){
           String s = iterator.next();
            System.out.println(s);
            System.out.println(s.length());
        }

    }
}
