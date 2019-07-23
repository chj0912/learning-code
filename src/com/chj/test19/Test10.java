package com.chj.test19;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个文件路径：（格式 D:\\aa\\cc.txt）");
        String pathname=sc.nextLine();
        File file=new File(pathname);

        if (file.exists()){
            System.out.println("文件已存在");
            System.out.println("文件大小为"+file.length()+"字节");
        }else {
            try {
                file.createNewFile();
                System.out.println("创建文件成功");
                System.out.println("文件大小为"+file.length()+"字节");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("文件路径错误");
            }
        }



    }

}
