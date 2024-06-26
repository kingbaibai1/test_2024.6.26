package org.example.File;

import static java.lang.System.*;

public class FileTest5 {
    public static void main(String[] args) {
        int n=6;
//        n*n-1*n-2*n-3;
        out.println(test1(n));
        out.println(test2(1));
    }

    public static int test1(int n){
        int m=1;
        if(n>0){
           m=n*test1(n-1);
        }
        return m;


    }
    public static int test2(int m){
      //第十天只剩一个，且前面的时一天少一半,第十天剩余一个桃子
        if(m==10){
            return 1;
        }
        return 2*test2(m+1)+2;
    }

}
