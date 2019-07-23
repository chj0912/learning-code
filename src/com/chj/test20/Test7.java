package com.chj.test20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test7 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\8.jpg");
        FileOutputStream fos=new FileOutputStream("E:\\8.jpg");
        int len;
        byte[] b=new byte[1024];
        while ((len=fis.read(b))!=-1){

            fos.write(b,0,len);
        }

        fos.close();
        fis.close();

    }
}
