package com.chj.test22;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Test7_1 {
            /*
            *登录实现 服务端
            * */

    public static void main(String[] args)throws IOException {
        System.out.println("服务启动，等待连接");
        ServerSocket serverSocket=new ServerSocket(6666);
        Socket accept=serverSocket.accept();
        Map<String,String > map =new HashMap<>();

        InputStream is=accept.getInputStream();
        byte [] bytes=new byte[50];
        int len=is.read(bytes);
        String str=new String(bytes,0,len);
        String [] np=str.split("=");

        BufferedReader br = new BufferedReader(new FileReader("D:\\a.txt"));
        OutputStream os=accept.getOutputStream();
        String line = null;
        while ((line = br.readLine()) != null) {
            map.put(line.split("=")[0],line.split("=")[1]);
        }
        if(map.containsKey(np[0])){
            if(map.get(np[0]).equals(np[1])){
                os.write("登录成功".getBytes());
            }else {
                os.write("密码错误".getBytes());
            }
        }else {
                os.write("用户不存在".getBytes());
        }

        os.close();
        br.close();
        is.close();


    }

}
