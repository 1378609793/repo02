package com.itheima.test.Demo03Set;

import javax.sound.midi.Soundbank;
import java.util.HashSet;

public class Demo02Set {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<String>();
        String s1 = new String("abc");
        String s2 = new String("abc");

        hashSet.add("abc");
        hashSet.add("重地");
        hashSet.add("通话");
        System.out.println(hashSet);

    }

}
