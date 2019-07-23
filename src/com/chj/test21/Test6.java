package com.chj.test21;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

    public static void main(String[] args)throws IOException {
        int a;
        InputStreamReader isr=new InputStreamReader(new FileInputStream("a.txt"),"utf-8");
        while ((a=isr.read())!=-1){

            System.out.print((char) a);
        }

        isr.close();
    }
}
