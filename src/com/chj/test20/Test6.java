package com.chj.test20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\8.jpg");
        FileOutputStream fos=new FileOutputStream("E:\\7.jpg");
        int b;
        while ((b=fis.read())!=-1){
            fos.write(b);
        }

        fos.close();
        fis.close();

    }
}
