package com.chj.test04_1;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入年份：");
        int year=sc.nextInt();

        if(year%4==0&&year%100!=0){
            System.out.println(year+"是润年");
        }else {
            System.out.println(year+"不是润年");
        }
    }
}
