package com.chj.test20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        FileWriter fw=new FileWriter("D:\\info.txt");
        while (true){
            System.out.println("请输入信息：");
            String str = sc.next();
            if(str.equals("886")){
                break;
            }else {
                char [] chs=str.toCharArray();
                fw.write(chs);
                fw.flush();
            }
        }
        fw.close();
    }
}
