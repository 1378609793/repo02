package com.itheima.test.Demo06Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

public class Demo01HashMapSavePerson {
    public static void main(String[] args) {

        show01();
        System.out.println("---");
        show02();
    }

    public static void show01() {


        Map<Person, String> map = new HashMap<Person, String>();
        map.put(new Person("女王", 18), "英国");
        map.put(new Person("普京", 30), "俄罗斯");
        map.put(new Person("奥巴马", 35), "美国");
        map.put(new Person("女王", 18), "法国");
        Set<Map.Entry<Person, String>> entries = map.entrySet();
        for (Map.Entry<Person, String> key : entries) {
            Person key1 = key.getKey();
            String s = key.getValue();
            System.out.println(key1 + s);

        }
    }
        public static void show02 () {

        Map<String,Person> map2 = new HashMap<String, Person>();
            map2.put("英国",new Person("女王", 18) );
            map2.put( "俄罗斯",new Person("普京", 30));
            map2.put( "美国",new Person("奥巴马", 35));
            map2.put( "英国",new Person("女王2", 18));

            Set<String> strings = map2.keySet();
            for(String key:strings){
                Person person = map2.get(key);
                System.out.println(person+key);
            }



        }
    }

