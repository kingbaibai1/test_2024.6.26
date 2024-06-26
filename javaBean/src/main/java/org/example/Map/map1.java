package org.example.Map;

import java.util.HashMap;
import java.util.Map;

public class map1 {
    public static void main(String[] args) {
        Map<String ,Integer>map=new HashMap<>();
        map.put("baibai",1);
        map.put("kaikai",2);
        map.put("feifei",3);
        map.put("chaochao",5);
        map.put("chaochao",5);

        System.out.println(map);

        //获取集合的大小
        System.out.println(map.size());

        //清空集合
//        map.clear();
//        System.out.println();

        //判断集合是否为空
        System.out.println(map.isEmpty());

        //根据键获取对于值
        System.out.println(map.get("baibai"));

        //判断是否包含某个值
        System.out.println(map.containsKey("baibai"));
        System.out.println(map.containsKey("baibai1"));
        System.out.println(map.containsValue(1));
        System.out.println(map.containsValue(7));

        //获取map集合的全部键
        System.out.println(map.keySet());
        //获取全部值
        System.out.println(map.values());

        //其他map集合的数据倒入到自己的集合中来（扩展）

        Map<String ,Integer>map1=new HashMap<>();
        map1.put("baibai1",1);
        map1.put("kaikai1",2);
        map1.put("feifei1",3);
        map1.put("chaochao1",5);
        map1.put("chaochao1",5);
        map.putAll(map1);
        System.out.println(map);


    }
}
