package org.example.String;

import java.util.Scanner;

public class StringTest6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int money;
        while(true){
            System.out.println("请输入一个金额");
            money=sc.nextInt();
            if(money>=0&&money<=9999999){
                break;
            }else{
                System.out.println("金额无效");
            }
        }
        String moneyStr="";
        while(true){
            int ge=money%10;
            System.out.println(ge);
            String capitalNumber=getCapitalNumber(ge);
            System.out.println(capitalNumber);

            moneyStr=capitalNumber+moneyStr;
            System.out.println(moneyStr);
            money=money/10;

            if(money==0){
                break;
            }
        }

        int count=7-moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr="零"+moneyStr;
        }
        System.out.println(moneyStr);


        String[] arr={"佰","拾","万","仟","佰","拾","元"};
        String result="";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c=moneyStr.charAt(i);
            result=result+c+arr[i];

        }
        System.out.println(result);
    }

    public static String getCapitalNumber(int number){
     String[] arr ={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
     return arr[number];
    }
}


