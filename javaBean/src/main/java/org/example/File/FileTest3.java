package org.example.File;

import java.io.File;

public class FileTest3 {
    public static void main(String[] args) {
        File file1 = new File("javaBean\\src\\main\\java\\org\\example\\File");
        String[] names=file1.list();
        //遍历当前文件下所有的一级文件名称，到一个字符串数组中去返回
        for (String name : names) {
            System.out.println(name);
        }

        File[] files=file1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }




    }
}
