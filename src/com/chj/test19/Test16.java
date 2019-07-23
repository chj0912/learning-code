package com.chj.test19;

import java.io.File;
import java.io.FileFilter;

public class Test16 {
    public static void main(String[] args) {
        String pathname = "D:\\BaiduNetdisk";
        File file = new File(pathname);
        getFile(file);

    }

    public static void getFile(File file){
        File[] files =file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()){
                    return true;
                }
                if(pathname.length()<200*1024){
                    return true;
                }
                return false;
            }
        });

        for(File file1:files){
            if(file1.isFile()){
                System.out.println(file1.getName()+"------->"+file1.length()/1024+"kb");
            }else {
                getFile(file1);
            }
        }
    }
}
