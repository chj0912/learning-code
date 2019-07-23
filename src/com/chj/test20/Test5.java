package com.chj.test20;

import java.io.FileInputStream;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args)throws IOException {
        FileInputStream fis=new FileInputStream("D:\\Test1.txt");
        byte [] b=new byte[1];

        while (fis.read(b)!=-1){
            System.out.println(new String(b));
        }


       fis.close();
    }
}
