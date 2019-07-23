package com.chj.test07;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("请输入第一个数据：");
        int a=scanner.nextInt();
        System.out.println("请输入第二个数据：");
        int b=scanner.nextInt();
        System.out.println("请输入第三个数据：");
        int c=scanner.nextInt();

        int temp=a;
        if(b>a){
            temp=b;
        }
        if(c>b){
            temp=c;
        }

        System.out.println("最大值为："+temp);
    }

}
