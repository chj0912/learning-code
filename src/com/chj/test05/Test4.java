package com.chj.test05;

public class Test4 {
    public static void main(String[] args) {
        int[] score = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        int count = 0;
        int avg;
        avg = getAvg(score);

        for (int i = 0; i < score.length; i++) {
            if (score[i] > avg) {
                count += 1;
            }
        }
        System.out.println("高于平均分" + avg + "的个数有" + count + "个人");

    }

    public static int getAvg(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum / arr.length;
    }

}
