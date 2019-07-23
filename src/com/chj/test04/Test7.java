package com.chj.test04;

public class Test7 {
    public static void main(String[] args) {
        double a=10.6d;
        int b=round(a);
        System.out.println(a+"-->"+b);

    }

   public static int round(double a){
        return (int)(a+0.5);
   }
}
