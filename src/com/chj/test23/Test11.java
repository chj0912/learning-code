package com.chj.test23;

import java.util.function.Supplier;

public class Test11 {
    public static void main(String[] args) {
        int[] array = {10, 20, 100, 30, 40, 50};
        printMax(()->{
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
});
    }

    private static void printMax(Supplier<Integer> supplier) {
        int max = supplier.get();
        System.out.println(max);
    }
}
