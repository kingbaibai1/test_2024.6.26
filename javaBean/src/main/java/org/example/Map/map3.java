package org.example.Map;

import java.util.*;

public class map3 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("xiaom",1);
        map.put("xiaoh",4);
        map.put("xiaok",3);
        map.put("xiaol1",1);
        map.put("xiaol2",1);
        map.put("xiaol3",1);
        map.put("xiaoq",2);
        map.put("xiaos",4);
        map.put("xiaod",3);
        int l=0;
        int m=0;
        int n=0;
        for (Integer value : map.values()) {
            if(value==1){
                l++;
            }
            if(value==2){
                n++;
            }
            if(value==3){
                m++;
            }
        }

        System.out.println(l);
        System.out.println(n);
        System.out.println(m);


        List<String> data=new ArrayList<>();
        String[] selects={"A","B","C","D"};
        Random random=new Random();
        for (int i = 1; i <= 80; i++) {
            data.add(selects[random.nextInt(4)]);
        }
        System.out.println(data);

        Map<String,Integer>map1=new HashMap<>();
        for (String s : data) {
            if(map1.containsKey(s)){
                map1.put(s,map1.get(s)+1);
            }else{
                map1.put(s,1);
            }
        }

        map1.forEach((k,v)->{
            System.out.println(k+"-->"+v);
        });

    }
}
