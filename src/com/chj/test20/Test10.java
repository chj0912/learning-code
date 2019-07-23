package com.chj.test20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test10 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\aaa");
        File[] files = file.listFiles();

        for (File file1 : files) {
            FileInputStream fis = new FileInputStream(file1);
            FileOutputStream fos = new FileOutputStream("D:\\bbb" + "\\" + file1.getName());
            byte[] b = new byte[1024];
            while (fis.read(b) != -1) {
                fos.write(b);
            }
            fos.close();
            fis.close();


        }


    }

}
