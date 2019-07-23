package com.chj.test02;

public class Test6 {

    public  static class printString{
        int num=100;
        String str =num%2==0?"偶数":"奇数";

    }

    public static void main(String[] args) {
         printString ps=new printString();
         System.out.println(ps.num+"是"+ps.str);

    }


}
