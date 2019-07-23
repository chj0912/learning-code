package com.chj.test22;

import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Test3 {
    public static void main(String[] args) throws Exception {
        /*
         * UDP  发送端
         * */

        String str = "你好呀，我是UDP";

        DatagramPacket packet = new DatagramPacket(
                str.getBytes(),
                str.getBytes().length,
                InetAddress.getLocalHost(),
                6666);

        DatagramSocket socket=new DatagramSocket();
        socket.send(packet);
        socket.close();


    }

}
