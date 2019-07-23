package com.chj.test22;

import javax.imageio.IIOException;
import java.io.*;
import java.net.Socket;

public class Test6_1 {
    /*
     * 客户端
     * */

    public static void main(String[] args) throws IOException {
        System.out.println("客户端启动，准备发送数据");

        Socket socket = new Socket("localhost", 6666);

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\12.jpg"));
        OutputStream os = socket.getOutputStream();
        byte[] b = new byte[1024 * 8];
        int len;
        while ((len = bis.read(b)) != -1) {
            os.write(b, 0, len);
        }
        socket.shutdownOutput();
        System.out.println("上传完毕");

        InputStream is = socket.getInputStream();

        byte[] bb = new byte[1024];
        int len1 = is.read(bb);
        System.out.println(new String(b, 0, len1));
        is.close();

        os.close();
        socket.close();
        bis.close();


    }

}
