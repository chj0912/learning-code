package com.chj.test21;

import java.io.*;

public class Test3 {
    public static void main(String[] args)throws IOException {

        try (
            BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\test.txt"));
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\copy.txt"))
                ){
            byte[] b=new byte[1024];
            int len;
            while ((len=bis.read(b))!=-1){
                bos.write(b,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
