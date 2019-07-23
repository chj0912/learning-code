package com.chj.test19;

import java.io.File;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) {

        String pathname = "D:\\a.txt";
        String pathname1 = "D:\\aaa";
        File file = new File(pathname);
        File file1 = new File(pathname1);

        if (file.exists()) {
            System.out.println("文件已存在");
            file.delete();
            System.out.println("删除成功");
        } else {
            try {
                file.createNewFile();
                System.out.println("创建文件成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (file1.exists()) {
            System.out.println("文件夹已存在");
            file.delete();
            System.out.println("删除成功");
        } else {
            file1.mkdir();
            System.out.println("创建文件夹成功");
        }


        file.delete();
        System.out.println("删除成功");

        file1.delete();
        System.out.println("删除成功");


    }


}
