package org.example.Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class collectionTest10 {
    public static void main(String[] args) {
        Set<String> names=new TreeSet<>();

        names.add("kaikai");
        names.add("kewgfai");
        names.add("keew");
        names.add("kgeigei");
        System.out.println(names);

        Iterator<String >it=names.iterator();
        while (it.hasNext()){
            String name=it.next();
            if(name.contains("g")){
                it.remove();
            }
        }
        System.out.println(names);
    }
}
