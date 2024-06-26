package org.example.String;

public class StringTest4 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(arrToString(arr));
    }

    public static String arrToString(int[] arr){
        if(arr==null){
            return "";
        }
        if(arr.length==0){
            return "[]";
        }
        String str="[";
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                str= str + arr[i];
            }else{
                str= str + arr[i]+",";
            }
        }
        str=str+"]";
        return str;
    }
}
