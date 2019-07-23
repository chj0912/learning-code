package com.chj.test02;

public class Test5 {

    public static class printNum {
        float f1 = 12345.01f;
        float f2 = 12345.00f;
        float v1=(f1>f2)?12456:12456.02f;
        float v2=v1+1024;

    }

    public static void main(String[] args) {

        printNum p = new printNum();
        System.out.println(p.v1);
        System.out.println(p.v2);


    }
}
