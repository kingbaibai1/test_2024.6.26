package org.example.IO_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class io2 {
    public static void main(String[] args) throws Exception {
        //1.创建一个字节输入流对象
        InputStream is= new FileInputStream("javaBean\\src\\main\\java\\org\\example\\IO_Stream\\file.txt");

        //2.开始读取文件中的字节数据，每次读取多个字节

//        byte[]buffer=new byte[6];
//        int len = is.read(buffer);
//        String rs=new String(buffer);
//        System.out.println(rs);
//        System.out.println("当此读取的字节数量："+len);
//
//        int len2=is.read(buffer);
//        String rs2=new String(buffer,0,len2);
//        System.out.println(rs2);
//        System.out.println("当此读取的字节数量："+len2);
//
//        int len3=is.read(buffer);
//        System.out.println(len3);

        byte[] bytes = new byte[4];
        int len;
        while((len=is.read(bytes))!=-1){
            String s = new String(bytes, 0, len);
            System.out.print(s);
        }
        //性能得到提升
        //但是还是会出现中文的乱码


        is.close();


    }
}
