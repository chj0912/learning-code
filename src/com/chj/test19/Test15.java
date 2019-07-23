package com.chj.test19;

import java.io.File;
import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String pathname=sc.nextLine();
        File file=new File(pathname);
        long size=calulate(file);
        System.out.println("该文件夹大小为："+size);
    }

    public static long calulate(File file){
        long size=0;
        File[] files=file.listFiles();
        for(File file1:files){
            if(file1.isFile()){
                size+=file1.length();
            }else {
                calulate(file1);
            }
        }
        return size;
    }
}
