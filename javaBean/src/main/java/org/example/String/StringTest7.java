package org.example.String;

public class StringTest7 {
    public static void main(String[] args) {
        String id="441581200305204579";

        String year=id.substring(6,10);
        String month=id.substring(10,12);
        String day=id.substring(12,14);
        System.out.println(year+"年"+month+"月"+day+"日");

        //获取性别
        char gender=id.charAt(16);
        int num=gender-48;
        if(num % 2 == 0){
            System.out.println("性别为:女");
        }else{
            System.out.println("性别为:男");
        }
    }

    public static String k(String phone){
        String result="";

        for (int i = 0; i < phone.length(); i++) {
            if(i>=4&&i<7){
              result=result+"*";
            }else{
                result=result+phone.charAt(i);
            }
        }
        return result;
    }
}
