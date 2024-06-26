package org.example.String;

public class StringTest8 {
    public static void main(String[] args) {
        String talk="你玩的真好，以后不要再完了，TMD";
        String talk1="你玩的真好，CNMD以后不要再完了，TMD";
        replace(talk);
        System.out.println(replaceAll(talk));
        System.out.println(replaceAll(talk1));

    }
    public static String replace(String talk){
        String result=talk.replace("TMD","***");
        System.out.println(result);
       return "";
    }
public static String replaceAll(String talk){
        String[] arr={"TMD","CNM","MLB"};
    for (String s : arr) {
        talk = talk.replace(s, "****");
    }
    return talk;
    }



}
