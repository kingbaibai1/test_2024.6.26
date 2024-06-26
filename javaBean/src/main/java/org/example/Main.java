package org.example;

import org.example.entity.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        User user=new User();
        user.setUsername("adb");
        System.out.println(user);

        //数组转换
        char[] chs={'a','b','c'};
        String s1=new String (chs);
        System.out.println(s1);

        //比特
        byte[] bytes={97,98,99,100};
        String s2=new String(bytes);
        System.out.println(s2);

        //new 的string会开辟新空间，此时地址编码不同
        String s3=new String("abc");
        String s4=new String("abc");
        //==比较的地址
        System.out.println(s3==s4);

        System.out.println(s3.equals(s4));
        //忽视大小写
        System.out.println(s3.equalsIgnoreCase(s4));



    }
}