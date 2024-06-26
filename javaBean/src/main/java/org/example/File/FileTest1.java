package org.example.File;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileTest1 {
    public static void main(String[] args) {
        //1.创建文件对象，指代某个文件
        File f1=new File("javaBean\\src\\main\\java\\org\\example\\File\\test1.txt");

        //2.判断当前文件是否存在，存在返回true
        System.out.println(f1.exists());
        //3.判断当前文件对象指代的是否是文件，是文件返回true，
        System.out.println(f1.isFile());
        //4.判断当前文件对象指代的是否是文件夹，是返回true
        System.out.println(f1.isDirectory());
        //5.获取文件的名称（包含后缀）
        System.out.println(f1.getName());
        //6.获取文件的大小
        System.out.println(f1.length());
        //7.获取文件最后修改的时间
        long time=f1.lastModified();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(dateFormat.format(time));
        //8.获取创建文件对象时，使用的路径
        System.out.println(f1.getParentFile());
        //9.获取绝对路径
        System.out.println(f1.getAbsolutePath());
    }
}
