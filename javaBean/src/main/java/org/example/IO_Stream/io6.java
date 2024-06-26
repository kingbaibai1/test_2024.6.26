package org.example.IO_Stream;

import java.io.*;

public class io6 {
    public static void main(String[] args) throws Exception {
        InputStream is= new FileInputStream("D:\\code\\project\\java基础\\javaBean\\src\\main\\java\\org\\example\\IO_Stream\\G (4).jpg");
        OutputStream os=new FileOutputStream("D:\\code\\project\\java基础\\javaBean\\src\\main\\java\\org\\example\\IO_Stream\\G (4)1.jpg");
        byte[]bytes=new byte[1024];
        int len;
        while((len=is.read(bytes))!=-1){
            os.write(bytes,0,len);
        }

        os.close();
        is.close();
        System.out.println("完成复制！");
    }
}
