package org.example.String;

import java.util.Objects;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1=sc.next();//new 出来的
        String str2="abc";
        //==比较的是地址
        System.out.println(str1==str2);//false
        System.out.println(Objects.equals(str1, str2));//true
    }
}
