package com.itheima.test.Demo03Set;

public class Demo01Set {
    public static void main(String[] args) {


        Demo03LinKedHashSet.Person person = new Demo03LinKedHashSet.Person();
        int i = person.hashCode();
        Demo03LinKedHashSet.Person person1 = new Demo03LinKedHashSet.Person();
        int i1 = person1.hashCode();
        System.out.println(i);//哈希值
        System.out.println(i1);//哈希值
        System.out.println(person);//哈希值
        System.out.println(person);//哈希值

        String  s1 = new String("ac");
        String  s2 = new String ("ac");
        int i2 = s1.hashCode();
        int i3 = s2.hashCode();
        System.out.println(i2);
        System.out.println(i3);

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
    }
}
