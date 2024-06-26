package org.example.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class collectionTest4 {
    public static void main(String[] args) {
        //ArrayList是基于数组
        //LinkedList是基于双向链表
        List<String> list = new ArrayList<>();

        list.add("java");
        list.add("java1");
        list.add("java2");
        list.add("java3");
        System.out.println(list);

        System.out.println("for循环--------");
        //for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("迭代器-----------");
        //迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("增强for循环----------");
        //增强for循环
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("lambda表达式-------");
        //lambda表达式
        System.out.println("1---");
        list.forEach(s -> {
            System.out.println(s);
        });
        System.out.println("2---");
        list.forEach((String s)->{
            System.out.println(s);
        });
        System.out.println("3---");
        //第二种
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });


    }
}
