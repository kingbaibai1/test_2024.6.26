package org.example.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class map {
    public static void main(String[] args) {
        //Map系列集合的特点都是由键决定的，值只是一个附属品，值是不做要求的

        //HashMap(由键决定特点）：无序，不重复，无索引；(用的最多)
        Map<String,Integer> map=new HashMap<>();//这是一行经典代码
        map.put("1",1);
        map.put("1",1);
        map.put("8",2);
        map.put("3",3);
        map.put("4",4);
        System.out.println(map);

        //LinkedHashMap((由键决定特点):由键决定的特点：有序，不重复，无索引
        Map<String,Integer> map1=new LinkedHashMap<>();//这是一行经典代码
        map1.put("1",1);
        map1.put("1",1);
        map1.put("8",2);
        map1.put("3",3);
        map1.put("4",4);
        System.out.println(map1);

        //TreeMap(由键决定特点):按照大小默认升序排序，不重复，无索引
        Map<Integer,String> map2=new TreeMap<>();//这是一行经典代码
        map2.put(1,"1");
        map2.put(8,"1");
        map2.put(8,"1");
        map2.put(2,"8");
        map2.put(3,"3");
        map2.put(4,"4");
        System.out.println(map2);

    }
}
