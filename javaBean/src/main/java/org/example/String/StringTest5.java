package org.example.String;

import javax.swing.*;
import java.util.Scanner;

public class StringTest5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个字符串");
        String str=sc.next();
        System.out.println(reverser(str));
    }

    public static String reverser(String str){
        String result="";
        for (int i = str.length()-1; i >= 0; i--) {
            char c=str.charAt(i);
            result=result+c;
        }

        return result;


    }
}
