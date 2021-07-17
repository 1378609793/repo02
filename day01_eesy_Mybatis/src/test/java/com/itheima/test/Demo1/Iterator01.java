package com.itheima.test.Demo1;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator01 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList();
        coll.add("add");
        coll.add("bbc");
        System.out.println(coll);
    
        boolean b1 =   coll.add("张三");

        coll.add("李四");
        coll.add("王五");
       // Iterator<String> iterator = coll.iterator();
       /* iterator.hasNext();
        iterator.next();
        iterator.hasNext();
        iterator.next();
        iterator.hasNext();
      String a =iterator.next();
        System.out.println(a);*/
/*
while (iterator.hasNext()){
    String Conn = iterator.next();
    System.out.println(Conn);
}
*/


/*
for (String a : coll){
    System.out.println(a);
}
*/
      //  System.out.println(coll);

    }
}
