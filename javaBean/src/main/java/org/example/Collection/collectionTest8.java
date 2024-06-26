package org.example.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class collectionTest8 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("addsfd");
        set.add("qwer");
        set.add("erty");
        set.add("dfgh");
        System.out.println(set);
        System.out.println(set.size());


        Set<Integer> set1=new LinkedHashSet<>();
        set1.add(1);
        set1.add(6);
        set1.add(3);
        set1.add(3);
        set1.add(4);
        System.out.println(set1);

        Set<Integer>set2=new TreeSet<>();
        set2.add(3);
        set2.add(7);
        set2.add(7);
        set2.add(6);
        set2.add(4);
        set2.add(1);
        System.out.println(set2);
    }
}
