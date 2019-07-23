package com.chj.test20;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\a.txt");
        fos.write('a');
        fos.close();
    }
}
