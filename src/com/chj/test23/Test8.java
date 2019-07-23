package com.chj.test23;

import com.chj.test19.Test;

public class Test8 {

    public static void main(String[] args) {

        int[] arry = getIntegerArray(10, int[]::new);
        System.out.println(arry);

    }

    public static int[] getIntegerArray(int length, ArrayBuilder builder) {
       return builder.buildArray(length);
    }


}

@FunctionalInterface
interface ArrayBuilder {
    abstract int [] buildArray(int length);
}