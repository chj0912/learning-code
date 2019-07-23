package com.chj.test14;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一串字符");
        String str=sc.nextLine();
        LinkedHashSet<Character> lhs=new LinkedHashSet();
        char []ch=str.toCharArray();
        for(Character cha:ch){
            lhs.add(cha);
        }

        for(Character c:lhs){
            System.out.println(c);
        }


    }

}
