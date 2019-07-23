package com.chj.test19;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        //绝对路径+File类一个参数构造方法创建
        String pathname="D://Test1.txt";
        File file=new File(pathname);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.getName());


        //相对路径
        String pathname2="Test1.txt";
        File file2= new File(pathname2);



        //相对路径+File类两个构造方法创建
        String parent="D://内网通";
        String child="test.txt";
        File file3=new File(parent,child);

        System.out.println("创建完成");

    }

}
