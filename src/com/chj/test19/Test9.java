package com.chj.test19;
public class Test9 {

    public static void main(String[] args) {

        int n=8;
        int ji=getjeicheng(n);
        System.out.println(ji);

    }

    public static int getjeicheng(int n){
        if(n==1){
            return 1;
        }
        return n*getjeicheng(n-1);
    }

}
