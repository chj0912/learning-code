package com.chj.test22;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test8 {
    /*
     * 文件下载  服务端
     * */

    public static void main(String[] args) throws IOException {

        System.out.println("服务启动，等待连接");

        ServerSocket serverSocket = new ServerSocket(6666);


            Socket accept = serverSocket.accept();

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\12.jpg"));
            OutputStream os = accept.getOutputStream();
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes))!=-1){
                os.write(bytes, 0, len);
                os.flush();
            }



            os.close();
            accept.close();
            System.out.println("已被下载");


    }


}
