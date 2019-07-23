package com.chj.test04_1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符");
        String str=sc.next();
        char ch=str.charAt(0);
        if(ch>=97&&ch<=122){
            ch-=32;
            System.out.println(str+"转化为"+ch);
        }else if(ch>=65&&ch<=90){
            ch+=32;
            System.out.println(str+"转化为"+ch);
        }else {
            System.out.println("输入错误");

        }

    }


}
