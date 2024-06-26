package org.example.IO_Stream;

import java.io.*;

public class io5 {
    public static void main(String[] args) throws IOException {
        //复制文件
        InputStream is= new FileInputStream("javaBean\\src\\main\\java\\org\\example\\IO_Stream\\file1.txt");
        byte[] bytes = is.readAllBytes();
        System.out.println(new String(bytes));

        OutputStream os=new FileOutputStream("javaBean\\src\\main\\java\\org\\example\\IO_Stream\\file2.txt");
        os.write(bytes);
        os.close();
        is.close();
    }
}
