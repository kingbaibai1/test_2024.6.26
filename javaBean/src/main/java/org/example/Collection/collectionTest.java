package org.example.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class collectionTest {
    public static void main(String[] args) {
        Collection<String>c=new ArrayList<>();
        //添加元素
        c.add("java1");
        c.add("java1");
        c.add("java2");
        c.add("java2");
        c.add("java3");
        c.add("java5");
        System.out.println(c);
        //清空集合的元素
//        c.clear();
//        System.out.println(c);
        //判断集合是否为空
        System.out.println(c.isEmpty());

        //获取集合的大小
        System.out.println(c.size());

        //判断集合中是否包含某个元素
        System.out.println(c.contains("java1"));
        System.out.println(c.contains("java"));

        //删除某个元素，如果又多个重复的元素默认删除前面的第一个
        c.remove("java2");
        System.out.println(c);

        //把集合转换成数组
        Object[] arr= c.toArray();
        System.out.println(Arrays.toString(arr));

        String[] str=c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(str));

        //把一个集合的全部数据倒入到另一个集合中去
        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String>c2=new ArrayList<>();
        c2.add("java3");
        c2.add("java4");
        c1.addAll(c2);
        System.out.println(c1);
        System.out.println(c2);


    }
}
