package com.chj.test22;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test5_1 {

    /*
     * TCP 服务端
     * */
    public static void main(String[] args) throws IOException {

        System.out.println("Server Start , waiting connect");

        ServerSocket serverSocket = new ServerSocket(6666);

        Socket socket = serverSocket.accept();

        InputStream is = socket.getInputStream();

        byte[] b = new byte[1024];
        int len = is.read(b);
        System.out.println("客户端发过来的消息是：" + new String(b, 0, len));
        /*
         * 回写数据
         * */

        OutputStream os = socket.getOutputStream();
        os.write("我收到啦".getBytes());


        os.close();
        is.close();
        socket.close();


    }


}
