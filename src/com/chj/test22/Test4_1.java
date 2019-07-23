package com.chj.test22;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test4_1 {
    public static void main(String[] args) throws IOException {
        /*
        * TCP 服务端
        * */

        System.out.println("服务器启动，等待连接");
        ServerSocket serverSocket=new ServerSocket(6666);

        Socket socket=serverSocket.accept();

        InputStream is=socket.getInputStream();
        byte[]b=new byte[1024];
        int len=is.read(b);
        String msg=new String (b,0,len);
        System.out.println(msg);
        is.close();
        serverSocket.close();




    }

}
