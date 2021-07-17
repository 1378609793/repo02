package com.itheima.test.Demo07Thread.Demo07Lambda.Demo02LambdaTest;

import java.util.Arrays;
import java.util.Comparator;
//Lambda表达式有参数有返回值的练习
public class ArraysTest {
    public static void main(String[] args) {
        Person[] Parr = {
            new Person("亚历山大",32),
            new Person("马里奥",28),
            new  Person("雷昂",31)
        };
        //根据年龄升序
        Arrays.sort(Parr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return  o1.getAge()-o2.getAge();
            }
        });

        //使用Lamdba表达式简化匿名内部类
        Arrays.sort(Parr,(Person o1, Person o2)->{
            return  o1.getAge()-o2.getAge();
        });

      //遍历
        for(int i =0;i<Parr.length;i++){
            System.out.println(Parr[i].name+Parr[i].age);
        }

        for(Person p : Parr){
            System.out.println(p.name+p.getAge());
        }

    }

}
