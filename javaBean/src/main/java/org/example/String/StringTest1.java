package org.example.String;

import java.util.Scanner;

public class StringTest1 {
    public static void main(String[] args) {
        String rightUsername="baibai";
        String rightPassword="123456";
        int i=0;
        do {

            Scanner sc=new Scanner(System.in);
            System.out.println("请输入用户名");
            String username=sc.next();
            System.out.println("请输入密码");
            String password=sc.next();

            if(username.equals(rightUsername)&&password.equals(rightPassword)){
                System.out.println("用户登录成功");
                break;
            }else{
                System.out.println("用户登录失败,你还剩下"+(2-i)+"次机会");
                i++;
            }
        } while (i<3);

    }
}
