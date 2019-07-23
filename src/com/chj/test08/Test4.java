package com.chj.test08;

public class Test4 {

    public static void main(String[] args) {
        String str="HelloWorld";

        char [] ch=str.toCharArray();
        for (int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }

        String s1=str.toLowerCase();
        String s2=str.toUpperCase();
        String s3=str.replace('o','6');
        String s4=str.replace("ll","LL");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
