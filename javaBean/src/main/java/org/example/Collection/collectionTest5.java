package org.example.Collection;

import java.util.LinkedList;

public class collectionTest5 {
    public static void main(String[] args) {

        //创建队列
        LinkedList<String> queue = new LinkedList<>();
        //入队
       queue.addLast("第一个人");
       queue.addLast("第二个人");
       queue.addLast("第三个人");
       queue.addLast("第四个人");
       System.out.println(queue);
        //出队
       int m=queue.size();
        for (int i = 0; i < m; i++) {
            System.out.println(queue.removeFirst());
        }
//        System.out.println(queue.removeFirst());
//        System.out.println(queue.removeFirst());
//        System.out.println(queue.removeFirst());



        //创建栈stack
        LinkedList<String>stack=new LinkedList<>();
        //入栈---push==addFirst
        stack.push("第一颗子弹");
        stack.push("第二颗子弹");
        stack.push("第三颗子弹");
        stack.push("第四颗子弹");
        stack.push("第五颗子弹");
        //出栈--pop==removeFirst
        int n=stack.size();
        for (int i = 0; i < n; i++) {
            System.out.println(stack.pop());
        }
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

    }
}
