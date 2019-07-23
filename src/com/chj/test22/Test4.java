package com.chj.test22;

import com.sun.security.ntlm.Client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Test4 {
    public static void main(String[] args)throws Exception {

        /*
        * TCP  客户端
        * */

        System.out.println("我是客户端，我要发送数据了");
        Socket socket=new Socket("localhost",6666);

        OutputStream os= socket.getOutputStream();

        os.write("我来了".getBytes());

        os.close();
        socket.close();


    }
}
