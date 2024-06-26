package org.example.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class collectionTest1 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("baibai");
        c.add("duoduo");
        c.add("kaikai");
        c.add("shuyu");
        c.add("xiaofeng");
        System.out.println(c);

        //从集合对象中获取迭代器对象
        Iterator<String>it=c.iterator();
        //用循环结合迭代器遍历集合
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("增强for：");
        for(String s:c){
            System.out.println(s);
        }

        System.out.println("--lambda:-----");
        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //第二种写法
        c.forEach((String s)->{
            System.out.println(s);
        });

    }
}
