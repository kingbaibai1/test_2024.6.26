package org.example.File;

import java.io.File;
import java.io.IOException;

public class FileTest6 {
    public static void main(String[] args) throws IOException {
        File file = new File("javaBean");
        String name="test1.txt";
        searchFile(file,name);
    }

    public static void searchFile(File dir,String name) throws IOException {
        if(dir==null||!dir.exists()||dir.isFile()){
            return;//无法搜索
        }

        //2.dir不是null，存在，一定是目录对象
        //获取当前目录下的全部一级文件对象
        File[] files=dir.listFiles();

        //3.判断当前目录下是否存在一级文件对象，以及是否可以拿到一级文件对象
        if(files!=null&&files.length>0){
            for (File f : files) {
                if(f.isFile()){
                    if(f.getName().contains(name)){
                        System.out.println("找到了"+f.getAbsolutePath());
                        Runtime runtime=Runtime.getRuntime();
                        runtime.exec(f.getAbsolutePath());
                    }
                }else{
                    searchFile(f,name);
                }
            }
        }

    }
}
