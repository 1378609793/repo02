package com.itheima.test.Demo04Collections;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo01Collections {
    public static void main(String[] args) {

         ArrayList<String> list = new ArrayList<String>();

         Collections.addAll(list,"a","b","c","马里奥","亚历山大");



         Collections.shuffle(list);//打乱集合顺序
         System.out.println(list);


         ArrayList<Integer> list1 = new ArrayList<Integer>();
         Collections.addAll(list1,1,3,2);
         Collections.sort(list1);//对数据进行升序
         System.out.println(list1);


         ArrayList<student> list3 = new ArrayList<student>();
         list3.add(new student("亚历山大",19));
         System.out.println(list3);
         String s = list3.get(0).getName();
         student st = list3.get(0);
         System.out.println(s);
         System.out.println(st);
       /*  student student = new student();
         String name = student.getName();
         System.out.println(name);*/
        StringBuffer  s2 = new StringBuffer();
        String dsf="dsf";

        
    }
}
