package com.chj.test18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test4 {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(3);
        Operation o1 = new Operation(5);
        Operation o2 = new Operation(8);
        Operation o3 = new Operation(10);
        service.submit(o1);
        service.submit(o2);
        service.submit(o3);

        service.shutdown();

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