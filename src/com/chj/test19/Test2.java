package com.chj.test19;

import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        File f=new File("D:\\Test1.txt");

        if(f.exists()){
            System.out.println("该文件已存在！");
        }else {
            try {
                f.createNewFile();
                System.out.println("文件创建成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
