package com.chj.test20;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args)throws IOException {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入学号和姓名姓名：（格式：学号-姓名）");
        FileOutputStream fos=new FileOutputStream("D:\\stu.txt");
        while (true){
            String str=sc.nextLine();
            if(str.equals("end")){
                break;
            }else {
                byte []b=str.getBytes();
                for(int i=0;i<b.length;i++){
                    fos.write(b[i]);
                }
                fos.write("\r\n".getBytes());
            }
        }
    }
}
