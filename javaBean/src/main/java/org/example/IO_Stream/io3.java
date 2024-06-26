package org.example.IO_Stream;

import java.io.*;

public class io3 {
    public static void main(String[] args) throws IOException {
        InputStream file = new FileInputStream("javaBean\\src\\main\\java\\org\\example\\IO_Stream\\file.txt");

//        File f=new File("javaBean\\src\\main\\java\\org\\example\\IO_Stream\\file.txt");
//        long size=f.length();
//        byte[] is=new byte[(int)size];
//
//        int read = file.read(is);
//        System.out.println(new String(is));
//        System.out.println(size);
//        System.out.println(read);

        byte[]buffer=file.readAllBytes();
        System.out.println(new String(buffer));




    }
}
