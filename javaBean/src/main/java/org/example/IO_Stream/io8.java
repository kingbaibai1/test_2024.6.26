package org.example.IO_Stream;

import java.io.*;

public class io8 {
    public static void main(String[] args) {

        try (
                //只能放资源对象
                InputStream is = new FileInputStream("D:\\code\\project\\java基础\\javaBean\\src\\main\\java\\org\\example\\IO_Stream\\G (4).jpg");
                OutputStream    os = new FileOutputStream("D:\\code\\project\\java基础\\javaBean\\src\\main\\java\\org\\example\\IO_Stream\\copy.jpg");
                MyConnection conn=new MyConnection();
        ) {

            byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes)) != -1) {
                os.write(bytes, 0, len);
            }
            System.out.println(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
