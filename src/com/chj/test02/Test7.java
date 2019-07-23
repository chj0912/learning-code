package com.chj.test02;

public class Test7 {


    public static void add(int x, int y) {
        System.out.println("x和y的和为：" + (x + y));

    }

    public static void sub(int x, int y) {
        System.out.println("x和y的差为：" + (x - y));
    }

    public static void mul(int x, int y) {

        System.out.println("x和y的积为：" + (x * y));
    }

    public static void div(int x, int y) {
        System.out.println("x和y的积为：" + (x / y));
    }

    public static void remian(int x, int y) {

        System.out.println("x和y的积为：" + (x % y));
    }

    public static void main(String[] args) {
        int x = 200;
        int y = 100;

        add(x, y);
        sub(x, y);
        mul(x, y);
        div(x, y);
        remian(x, y);
    }

}
