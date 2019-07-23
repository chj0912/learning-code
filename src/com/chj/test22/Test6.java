package com.chj.test22;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Test6 {

    public static void main(String[] args)throws IOException {
        /*
        * 服务器
        * */
        System.out.println("服务开启，等待连接");
        ServerSocket serverSocket=new ServerSocket(6666);
        Socket socket=serverSocket.accept();
        InputStream is=socket.getInputStream();

        byte[]bytes=new byte[1024*8];
        BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream("D:\\"+(System.currentTimeMillis()+".jpg")));
        int len;
        while ((len=is.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

        OutputStream os=socket.getOutputStream();
        os.write("上传成功".getBytes());

        os.close();
        bos.close();
        is.close();
        socket.close();
        System.out.println("ok!!");





    }

}
