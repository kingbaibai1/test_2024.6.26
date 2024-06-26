package org.example.File;

import java.io.File;
import java.io.IOException;

public class FileTest2 {
    public static void main(String[] args) throws IOException {
        File file = new File("javaBean\\src\\main\\java\\org\\example\\File\\test\\test.txt");
        System.out.println(file.getParentFile());
        if(!file.getParentFile().exists()){
            System.out.println("创建了文件夹");
            file.getParentFile().mkdir();

        }
        if(!file.exists()){
            System.out.println("创建文件");
            file.createNewFile();
        }

        //创建多级文件夹
//        if(file.getParentFile().exists()){
//            System.out.println("//创建多级文件夹");
//            file.getParentFile().mkdirs();
//        }1

        //删除文件
        file.delete();
        //delete不能删除非空文件夹
        System.out.println(file.getParentFile().delete());


    }
}
