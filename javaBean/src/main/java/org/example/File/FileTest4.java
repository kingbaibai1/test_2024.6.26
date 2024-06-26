package org.example.File;

import java.io.File;

public class FileTest4 {
    public static void main(String[] args) {
        //改变某个文件夹下的视频的序号
        File file=new File("javaBean\\src\\main\\java\\org\\example\\File");
        File[]files=file.listFiles();
        for (File txt : files) {
            String name = txt.getName();
            System.out.println(name.length());
        }

    }
}
