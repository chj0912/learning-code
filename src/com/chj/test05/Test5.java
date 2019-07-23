package com.chj.test05;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {1, 8, 10, 18, 28, 12};
        printBall(arr);
    }

    public static void printBall(int[] array) {
        System.out.println("你的双色球是：");

        for (int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }
}
