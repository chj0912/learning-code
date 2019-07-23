package com.chj.test23;

import java.util.Random;

public class Test4 {

    public static void main(String[] args) {
        RamdomUtil ru = new RamdomUtil();
        int [] i={1,5,8,3,6};

        getRandomNumOne(5,ru::nextInt);
        getRandomNumAtoB(4,9,ru::nextInt);
        getRandomNumArray(i,ru::nextInt);


    }

    public static void getRandomNumOne(int num, NumberSupplier ns) {
        System.out.println(ns.getNum(num));
    }

    public static void getRandomNumAtoB(int a, int b, NumberSupplier ns) {
        System.out.println(ns.getNum(a,b));
    }

    public static void getRandomNumArray(int[] nums, NumberSupplier ns) {
        System.out.println(ns.getNum(nums));
    }


}

@FunctionalInterface
interface NumberSupplier {
    abstract int getNum(int... nums);

}


class RamdomUtil {
    private Random random = new Random();

    public int nextInt(int... nums) {
        if (nums == null || nums.length == 0) {
            throw new RuntimeException("eeeeeeee");
        }
        if (nums.length == 1) {
            return random.nextInt(nums[0]) + 1;
        }
        if (nums.length == 2) {
            return random.nextInt(nums[1] + 1 - nums[0]) + 1;
        }
        return nums[random.nextInt(nums.length)];
    }
}
