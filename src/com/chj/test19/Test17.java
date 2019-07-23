package com.chj.test19;

import java.io.File;
import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pathname = sc.nextLine();
        File file = new File(pathname);
        del(file);

    }

    public static void del(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                file1.delete();
                System.out.println(file1.getName() + "文件删除成功");
            } else {
                del(file1);
            }
            if (file1.isDirectory()) {
                file1.delete();
                System.out.println(file1.getName() + "文件夹删除成功");
            }
            file.delete();
            System.out.println(file.getName() + "文件夹删除成功");

        }
    }

}
