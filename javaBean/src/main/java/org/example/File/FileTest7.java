package org.example.File;

import java.io.File;
import java.util.Dictionary;

public class FileTest7 {
    public static void main(String[] args) {
        //删除非空文件夹
        File dir = new File("javaBean\\src\\main\\java\\org\\example\\kaikai");
        String name="kaikai";
        deleteFile(dir);

    }

    public static void deleteFile(File dir){
        if(dir==null||!dir.exists()){
            return;
        }
        if(dir.isFile()){
            dir.delete();
            return;
        }

        File[] files=dir.listFiles();
        if(files==null){
            return;
        }

        for (File file1 : files) {
            if(file1.isFile()){
                file1.delete();
            }else{
                deleteFile(file1);
            }
        }
        dir.delete();
    }
}
