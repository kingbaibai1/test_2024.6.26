package org.example.File;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        //三种写法
        File file = new File("D:\\test.txt");
        File file1 = new File("D:/test.txt");
        File file2 = new File("D:"+File.separator+"test.txt");

        System.out.println(file.length());
        System.out.println(file1.length());
        System.out.println(file2.length());

        //可以指定一个不存在的文件对象
        File file3=new File("javaBean\\src\\main\\java\\org\\example\\File\\test2.txt");
        System.out.println(file3.exists());

        System.out.println(file3.length());
        if(!file3.exists()){
            //创建文件
            file3.createNewFile();
            //mkdir创建文件夹
            // file3.mkdir();
        }



    }
}
