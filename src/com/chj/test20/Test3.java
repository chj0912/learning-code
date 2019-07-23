package com.chj.test20;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\a.txt", true);
        byte[] b = "i love java".getBytes();

        for (int i = 0; i < 5; i++) {
            fos.write(b);
            fos.write("\r\n".getBytes());
        }
        fos.close();

    }
}
