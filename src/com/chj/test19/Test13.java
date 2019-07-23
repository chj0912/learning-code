package com.chj.test19;

import java.io.File;
import java.io.FileFilter;

public class Test13 {
    public static void main(String[] args) {
           File file=new File("D:\\aaa");
           printFile(file);

    }

    public static void printFile(File file){

        File[] files1=file.listFiles(file1->{
            return file1.getName().endsWith(".java");
        });



       /* File[] files=file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                //不考虑子文件夹下的.java文件,如果需要则后面加  ||pathname.isDirectory()
                return pathname.getName().endsWith(".java");
            }
        });*/


        for(File file1:files1){
            if(file1.isFile()){
                System.out.println("文件名："+file1.getAbsolutePath());
            }else {
                printFile(file1);
            }
        }

    }
}
