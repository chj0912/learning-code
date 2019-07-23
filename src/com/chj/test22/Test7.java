package com.chj.test22;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) throws IOException {
        /*
         * 登录实现 客户端
         * */
       // Socket socket = new Socket("localhost", 6666);
        Socket socket = new Socket("127.0.0.1",6666);

        OutputStream os = socket.getOutputStream();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        os.write(str.getBytes());



        /*
         * 接收消息
         * */
        InputStream is = socket.getInputStream();

        byte[] b = new byte[1024];
        int len = is.read(b);
        System.out.println(new String(b, 0, len));
        is.close();

        os.close();


    }
}
