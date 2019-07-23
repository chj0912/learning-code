package com.chj.test20;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Test13 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个目录的路径");
        String pathname = sc.nextLine();
        File file = new File(pathname);
        ArrayList<String> list = new ArrayList<>();

        getfile(file, list);
        System.out.println(list.size());

    }

    public static void getfile(File file, ArrayList<String> list) throws IOException {
        Random r = new Random();
        File[] files1 = file.listFiles((f) -> {
            return f.getName().endsWith(".java") || f.isDirectory();
        });
        for (File file1 : files1) {
            if (file1.isDirectory()) {
                getfile(file1, list);
            } else {
                if (isHave(list, file1.getName())) {
                    String newname = r.nextInt(200) + file1.getName();
                    list.add(newname);
                    FileInputStream fis = new FileInputStream(file1.getAbsolutePath());

                    FileOutputStream fos = new FileOutputStream("D:\\JAVA1\\" + newname);
                    int a;
                    while ((a = fis.read()) != -1) {
                        fos.write(a);
                    }
                    fos.close();
                    fis.close();
                } else {
                    list.add(file1.getName());
                    FileInputStream fis = new FileInputStream(file1.getAbsolutePath());

                    FileOutputStream fos = new FileOutputStream("D:\\JAVA1\\" + file1.getName());
                    int a;
                    while ((a = fis.read()) != -1) {
                        fos.write(a);
                    }
                    fos.close();
                    fis.close();
                }

            }
        }
    }

    public static boolean isHave(ArrayList<String> arr, String name) {
        boolean b = false;
        if (arr.contains(name)) {
            b = true;
        }
        return b;
    }
}


