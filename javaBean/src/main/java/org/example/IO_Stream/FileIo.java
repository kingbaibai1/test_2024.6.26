package org.example.IO_Stream;

import java.io.FileReader;
import java.io.Reader;

public class FileIo {
    public static void main(String[] args) {
        //创建一个文件字符输入流管道与源文件接通
        try (
                Reader fr=new FileReader("javaBean\\src\\main\\java\\org\\example\\IO_Stream\\file.txt");
        ){
            //读取文本文件的内容
//            int c;
//            while((c=fr.read())!=-1){
//                System.out.print((char)c);
//            }
            //每次读取多个字符

            int len;
            char[] buffer=new char[3];
            while((len=fr.read(buffer))!=-1){
                System.out.print(new String(buffer,0,len));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
