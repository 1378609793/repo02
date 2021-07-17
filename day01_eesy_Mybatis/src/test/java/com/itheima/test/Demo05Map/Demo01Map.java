package com.itheima.test.Demo05Map;

import sun.security.util.AuthResources_it;

import java.awt.image.PackedColorModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo01Map {
    public static void main(String[] args) {
      show01();
    }
    public static  void  show01(){

        Map<String,String> map = new HashMap<String, String>();
        String v1 = map.put("李晨","范冰冰1");
        System.out.println(v1);
        String v2 = map.put("李晨","范冰冰2");
        System.out.println(v2);
        String v3 = map.put("李晨","范冰冰3");
        System.out.println(v3);//如果k重复，返回value是前一个被替换的值
        System.out.println(map);

        System.out.println("-------------------------");

        HashMap<String,Integer> map1 = new HashMap<String, Integer>();
        map1.put("亚历山大",170);
        map1.put("爱丽丝",175);
        map1.put("玛丽莎",180);
        //遍历

       Set<String> strings = map1.keySet();
      Iterator<String> iterator = strings.iterator();
       while (iterator.hasNext()){
            String next = iterator.next();
            Integer integer = map1.get(next);
            System.out.println(next+integer);
        }

        for(String s : strings){

            Integer integer =map1.get(s);
            System.out.println(s+integer);
        }


       /* Set<String> strings = map1.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            Integer integer = map1.get(next);
            System.out.println(next+"="+integer);
        }
       for(String key: strings){
          Integer value = map1.get(key);
          System.out.println(key+value);
}
        for(String key :map1.keySet()){
           Integer iterator1= map1.get(key);
            System.out.println(key+iterator1);
        }*/

    }
}
