package com.chj.test20;

import java.io.FileInputStream;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args)throws IOException {
        FileInputStream fis=new FileInputStream("D:\\Test1.txt");
        int b;
        while ((b=fis.read())!=-1){
            System.out.println((char) b);
        }
        fis.close();
    }
}
