package com.chj.test22;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Test3_1 {
    public static void main(String[] args) throws Exception{
        /*
        * UDP 接收端
        * */

        DatagramSocket socket=new DatagramSocket(6666);

        byte[] buf=new byte[1024];

        DatagramPacket packet=new DatagramPacket(buf,buf.length);
        socket.receive(packet);

        int len=packet.getLength();
        System.out.println("len=="+len);
        System.out.println("接收的内容是=="+new String(buf,0,len));

        String ip=packet.getAddress().getHostAddress();
        int port=packet.getPort();
        System.out.println("发送端的接口："+port);
        System.out.println("发送端的IP："+ip);

        socket.close();

    }

}
