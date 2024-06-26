package org.example.IO_Stream;

import java.io.FileWriter;
import java.io.IOException;

public class FIleIo1 {
    public static void main(String[] args) {

        try(  //FileWriter fw = new FileWriter("javaBean\\src\\main\\java\\org\\example\\IO_Stream\\file.txt");
              FileWriter fw = new FileWriter("javaBean\\src\\main\\java\\org\\example\\IO_Stream\\file.txt",true);

        ) {
           fw.write('1');
           fw.write('a');
           fw.write('e');
           fw.write("我爱你");
           fw.write("\r\n");

           fw.write("我爱你中国abc",0,5);
           fw.write("\r\n");

           char[]buffer={'黑','马','a','b','c'};
           fw.write(buffer);
           fw.write("\r\n");

           fw.write(buffer,0,2);


        } catch (Exception e) {
          e.printStackTrace();
        }
    }
}
