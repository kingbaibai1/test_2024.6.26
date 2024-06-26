package org.example.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map2 {
    public static void main(String[] args) {
        Map<String ,Integer> map=new HashMap<>();
        map.put("baibai",1);
        map.put("kaikai",2);
        map.put("feifei",3);
        map.put("chaochao",5);
        map.put("chaochao",5);

        System.out.println(map);

        for (String s : map.keySet()) {
            System.out.println(s+":");
            System.out.println(map.get(s));
        }

        map.keySet().forEach(s -> {
            System.out.println(s+":");
            System.out.println(map.get(s));
        });


        //1.调用Map集合提供entrySet方法，把map集合转换成键值对类型的set集合
        Set<Map.Entry<String,Integer>> entries=map.entrySet();
        System.out.println(entries);
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
            String key=entry.getKey();
            Integer value=entry.getValue();
            System.out.println(key+"-->"+value);
        }

        //Lambda表达式
        System.out.println("Lambda表达式----");
        map.forEach((k,v)->{
            System.out.println(k+"-->"+v);
        });



    }
}
