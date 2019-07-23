package com.chj.test22;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Random;

public class Test8_1 {
    /*
     * 文件下载 客户端
     * */
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 6666);
        InputStream is = socket.getInputStream();
        Random r=new Random();
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\"+r.nextInt(100)+".jpg"));
        byte[]bytes=new byte[1024];
        int len;
        while ((len=is.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

        bos.close();
        is.close();
        socket.close();
        System.out.println("下载成功");


    }


}
