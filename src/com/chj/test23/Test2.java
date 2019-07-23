package com.chj.test23;

public class Test2 {
    public static void main(String[] args) {

        getPorduct(4,5,(int a,int b)->a*b);


    }

    public static void getPorduct(int a,int b,IntCalc calc){
        System.out.println(calc.calc(a,b));
    }
}


@FunctionalInterface
interface IntCalc{
    abstract int calc(int a,int b);
}