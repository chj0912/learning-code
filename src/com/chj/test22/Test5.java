package com.chj.test22;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Test5 {
    /*
    * TCP 客户端
    * */

    public static void main(String[] args)throws IOException {
        System.out.println("send message of client");

        Socket socket=new Socket("localhost",6666);

        OutputStream os=socket.getOutputStream();
        os.write("i am come ".getBytes());

        /*
        * 接收服务端传来的数据
        * */
        InputStream is=socket.getInputStream();

        byte[] b=new byte[1024];
        int len=is.read(b);
        System.out.println("服务端的数据："+new String(b,0,len));
        is.close();
        os.close();




    }

}
