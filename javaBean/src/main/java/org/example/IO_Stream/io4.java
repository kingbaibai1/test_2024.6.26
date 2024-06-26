package org.example.IO_Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class io4 {
    public static void main(String[] args) throws Exception {
        //创建一个字节流输出流管道与目标文件接通,文件可以自动创建
//        OutputStream os=new FileOutputStream("javaBean\\src\\main\\java\\org\\example\\IO_Stream\\file1.txt");

        //追加
        OutputStream os=new FileOutputStream("javaBean\\src\\main\\java\\org\\example\\IO_Stream\\file1.txt",true);


        //写字节数据出去
//        os.write(97);
//        os.write('b');
//        os.write('类');//默认只能写出去一个字节
        byte[]bytes="我爱你中国".getBytes();
//        os.write(bytes);
        os.write(bytes,0,9);

        //换行符号
        os.write("\r\n".getBytes());

        os.close();
    }
}
