package org.example.IO_Stream;

import java.io.*;

public class io1 {
    public static void main(String[] args) throws IOException {
        //1.创建文件字节输入流管道，与源文件接通
//        InputStream is= new FileInputStream(new File("javaBean\\src\\main\\java\\org\\example\\IO_Stream\\file.txt"));

        //简化写法
        InputStream is= new FileInputStream("javaBean\\src\\main\\java\\org\\example\\IO_Stream\\file.txt");

        //2.读取文件的字节流
//        int b1=is.read();
//        System.out.println((char)b1);
//
//        int b2=is.read();
//        System.out.println((char)b2);
//
//        int b3=is.read();
//        System.out.println((char)b3);
//
//        int b4=is.read();
//        System.out.println(b4);
        int b1;
        while((b1=is.read())!=-1){
            System.out.print((char)b1);
        }
        //读取数据的性能很差
        //读取汉字输出会乱码，无法避免
        //流使用完之后必须关闭，释放系统资源
        is.close();;



    }
}
