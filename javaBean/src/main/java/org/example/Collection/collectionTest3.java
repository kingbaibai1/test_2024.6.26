package org.example.Collection;

import java.util.ArrayList;
import java.util.List;

public class collectionTest3 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("baibai");
        list.add("duoduo");
        list.add("duoduo");
        list.add("kaikai");
        list.add("chaochao");
        System.out.println(list);
        //某个索引位置插入数据
        list.add(2,"shuyu");
        System.out.println(list);

        //根据索引删除元素，返回被删除的元素
        System.out.println(list.remove(4));
        System.out.println(list);

        //返回集合中指定位置的yuans
        System.out.println(list.get(3));

        //修改索引位置的元素，修改成功后，会返回原来被修改的数据
        System.out.println(list.set(2,"feiheng"));
        System.out.println(list);

    }
}
