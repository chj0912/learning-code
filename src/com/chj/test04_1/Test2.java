package com.chj.test04_1;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入三角形边的数据：");
        System.out.println("请输入三角形的第一条边：");
        int a=sc.nextInt();
        System.out.println("请输入三角形的第二条边：");
        int b=sc.nextInt();
        System.out.println("请输入三角形的第三条边：");
        int c=sc.nextInt();

        if((a+b>c&&a+c>b&&b+c>a)&&(a-b<c&&a-c<b&&b-c<a)){
            System.out.println("这是个三角形");
        }else {
            System.out.println("这不是三角形");
        }
    }
}
