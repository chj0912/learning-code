package com.chj.test19;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个文件路径：（格式 D:\\aa\\cc.txt）");
        String pathname = sc.nextLine();
        File file = new File(pathname);

        if (file.isFile()) {
            System.out.println("文件大小为" + file.length() + "字节");
        } else {
            try {
                File[] name = file.listFiles();
                int sum = 0;
                for (File file1 : name) {
                    sum += file1.length();
                }
                System.out.println(sum);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

