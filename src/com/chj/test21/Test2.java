package com.chj.test21;

import java.io.*;

public class Test2 {
    public static void main(String[] args)throws IOException {

        try(
             BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\e.txt"))
                ) {
            byte[] b="i love java".getBytes();
            for(int i=0;i<b.length;i++){
                bos.write(b[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
