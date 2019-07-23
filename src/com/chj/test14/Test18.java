package com.chj.test14;

import java.util.HashSet;
import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> set=new HashSet<>();
        while (true){
            int r=sc.nextInt();
            if (r==-1){
                break;
            }else {
                set.add(r);
            }
        }
        double sum=0;
        for(Integer i:set){
            System.out.println(i);
            sum+=i;

        }
        System.out.println("和："+sum);
        double d=sum/set.size();
        System.out.println("平均值："+d);
    }

}
