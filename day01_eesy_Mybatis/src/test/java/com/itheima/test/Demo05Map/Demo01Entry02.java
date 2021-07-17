package com.itheima.test.Demo05Map;

import javax.swing.tree.VariableHeightLayoutCache;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo01Entry02 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("马里奥",170);
        map.put("亚历山大",180);
        map.put("雷昂",182);
        Set<Map.Entry<String, Integer>> eset= map.entrySet();

        Iterator<Map.Entry<String, Integer>> iterator = eset.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();


            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key+"="+value);
        }

    }


}
