package com.chj.test20;

import java.io.FileInputStream;
import java.io.IOException;

public class Test11 {
    public static void main(String[] args)throws IOException {
        getCount('a');

    }
    public static void getCount(char ch)throws IOException {
        FileInputStream fis=new FileInputStream("D:\\test.txt");
        int a;
        int count=0;
        while ((a=fis.read())!=-1){
            if((char)a==ch){
                count++;
            }
        }
        fis.close();
        System.out.println(ch+"-----"+count);
    }

}
