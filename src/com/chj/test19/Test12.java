package com.chj.test19;

import java.io.File;

public class Test12 {
    public static void main(String[] args) {
        String pathname = "D:\\aaa";
        File file = new File(pathname);
        getPanth(file);



    }

    public static void getPanth(File file){
        File[] files=file.listFiles();
        for(File file1:files){
            if(file1.isFile()){
                System.out.println(file1.getName()+"-->"+file1.getAbsolutePath());
            }else {
                getPanth(file1);
            }
        }



    }

}
