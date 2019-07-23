package com.chj.test04;

public class Test2 {


    public static void main(String[] args) {
        int length=20;
        int width=8;
        int zc=getPermete(length,width);
        int area=getArea(length,width);

        System.out.println(zc);
        System.out.println(area);

    }

    private static int getPermete(int length, int width) {
        System.out.println("长方形周长：" +(length + width) * 2);
        return (length + width) * 2;
    }


    public static int getArea(int length, int width) {
        System.out.println("长方形面积：" + length * width);
        return length * width;
    }

}
