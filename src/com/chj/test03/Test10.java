package com.chj.test03;

public class Test10 {
    public static void main(String[] args) {
        System.out.println("while方式");
        print99();
        System.out.println("==========================================================================");
        System.out.println("do.....while方式");
        print999();
    }

    public static void print99() {
        int i = 1;
        int j = 1;
        while (i <= 9) {
            while (j <= i) {
                System.out.print(i + "*" + j + "=" + (i * j) + "\t");
                j++;
            }
            i++;
            j = 1;
            System.out.println(" ");
        }
    }

    public static void print999() {
        int i = 1;
        int j = 1;
        do {
            do {
                System.out.print(i + "*" + j + "=" + (i * j) + "\t");
                j++;
            } while (j <= i);
            i++;
            j = 1;
            System.out.println(" ");
        } while (i <= 9);
    }

}
