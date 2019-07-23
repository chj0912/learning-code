package com.chj.test20;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args)throws IOException {
        FileOutputStream fos=new FileOutputStream("D:\\a.txt");
        byte[] b="超人".getBytes();
        fos.write(b);
        fos.close();
    }
}
