package org.example.IO_Stream;

import java.io.*;

public class io7 {
    public static void main(String[] args)  {
        OutputStream os = null;
        InputStream is = null;
        try {  //不行
            is = new FileInputStream("D:\\code\\project\\java基础\\javaBean\\src\\main\\java\\org\\example\\IO_Stream\\G (4).jpg");
            os = new FileOutputStream("D:\\code\\project\\java基础\\javaBean\\src\\main\\java\\org\\example\\IO_Stream\\copy.jpg");

            byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes)) != -1) {
                os.write(bytes, 0, len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //千万不要在finally中返回数据
            //在finally中释放资源
            System.out.println("finally_执行了");
            try {
                if(os!=null){
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(is!=null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }


    }
}
