package org.example.String;

import java.util.*;
import java.util.stream.*;

public class Stream {
    public static void main(String[] args) {
        List<String>names=new ArrayList<>();
        Collections.addAll(names,"非非风","白白树","非鱼书","强非");
        System.out.println(names);

        List<String>list=new ArrayList<>();
        for (String name : names) {
            if(name.startsWith("非")&&name.length()==3){
                list.add(name);
            }
        }
        System.out.println(list);

        List<String>list2=names.stream().filter(s -> s.startsWith("非"))
                .filter(s -> s.length()==3).collect(Collectors.toList());
        System.out.println(list2);

        //2.如何获取Set集合的Stream流
        Set<String> set=new HashSet<>();
        Collections.addAll(set,"流","开","非");
        System.out.println(set);
        java.util.stream.Stream<String> stream = set.stream();
        stream.filter(s -> s.startsWith("流")).forEach(s -> System.out.println(s));

        Map<String,Double>map=new HashMap<>();
        map.put("古力娜扎",172.3);
        map.put("迪丽热巴",173.3);
        map.put("马儿扎哈",174.3);
        map.put("卡尔扎巴",144.3);
        System.out.println(map);
        Set<String>keys=map.keySet();
        java.util.stream.Stream<String> ks=keys.stream();

        Collection<Double>values=map.values();
        java.util.stream.Stream<Double>vs=values.stream();

        Set<Map.Entry<String,Double>>entries=map.entrySet();
        java.util.stream.Stream<Map.Entry<String, Double>> kvs = entries.stream();
        kvs.filter(e->e.getKey().contains("巴"))
                .forEach(e-> System.out.println(e.getKey()+"--->"+e.getValue()));


        String[] names2={"张翠山","东方不败","唐大山","独孤求败"};
        java.util.stream.Stream<String> stream1 = Arrays.stream(names2);
        stream1.filter(e->e.contains("山")).forEach(e-> System.out.println(e));
    }
}
