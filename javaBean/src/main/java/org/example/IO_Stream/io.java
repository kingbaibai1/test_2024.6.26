package org.example.IO_Stream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class io {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //1.编码
        String data="a我b";
        byte[]bytes=data.getBytes();//默认是按照平台字符集（uTF-8)进行编码
        System.out.println(Arrays.toString(bytes));

        //按照指定字符集进行编码
        byte[] bytes1=data.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));

        //2.解码
        String s1=new String(bytes);
        System.out.println(s1);

        String s2=new String(bytes1,"GBK");
        System.out.println(s2);
    }
}
