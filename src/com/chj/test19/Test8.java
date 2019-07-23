package com.chj.test19;

public class Test8 {

    public static void main(String[] args) {
        int n=100;
        int sum=getSum(n);
        System.out.println(sum);

    }
    public static int getSum(int n){
        if(n==1){
            return 1;
        }
        return n+getSum(n-1);
    }

}
