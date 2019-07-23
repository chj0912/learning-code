package com.chj.test04;

public class Test3 {

    public static void main(String[] args) {
        int a = getSum(100);
        System.out.println(a);
    }

    public static int getSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
