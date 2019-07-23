package com.chj.test17;

public class Test9 {
    public static void main(String[] args) {
        Operation o1 = new Operation(5);
        Operation o2 = new Operation(8);
        Operation o3 = new Operation(10);
        new Thread(o1, "一线程").start();
        new Thread(o2, "二线程").start();
        new Thread(o3, "三线程").start();
    }
}


class Operation implements Runnable {
    Object lock = new Object();
    int number;

    public Operation(int number) {
        this.number = number;
    }

    public void run() {
        String name = Thread.currentThread().getName();

        synchronized (lock) {
            int sum = 1;
            for (int k = 1; k <= number; k++) {
                sum *= k;
            }
            System.out.println(name+"="+sum);
        }

    }

}
