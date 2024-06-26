package org.example.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class collectionTest6 {
    public static void main(String[] args) {




        //HashSet:无序，不重复，无索引
        Set<String> set = new HashSet<>();
        set.add("java1");
        set.add("java2");
        set.add("java5");
        set.add("java4");
        set.add("java3");
        set.add("java3");

        System.out.println(set);
        //LinkedHashSet:有序，不重复，无索引
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("java1");
        set1.add("java2");
        set1.add("java5");
        set1.add("java4");
        set1.add("java3");
        set1.add("java3");

        System.out.println(set1);

        //TreeSet:排序，不重复，无索引
        Set<String> set2 = new TreeSet<>();
        set2.add("java1");
        set2.add("java2");
        set2.add("java5");
        set2.add("java4");
        set2.add("java3");
        set2.add("java3");

        System.out.println(set2);


    }
}
