package org.example.Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class collection {
    public static void main(String[] args) {
        //简单确认一下Collection集合的特点
        //ArrayList.LinkedList::有序，可重复，有索引
        ArrayList<String>list=new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        list.add("java2");
        list.add("java5");

        System.out.println(list);

        //HashSet:无序，不重复，无索引
        HashSet<String>set=new HashSet<>();
        set.add("java1");
        set.add("java4");
        set.add("java2");
        set.add("java3");
        set.add("java5");
        System.out.println(set);
    }
}
