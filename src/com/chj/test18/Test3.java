package com.chj.test18;

import java.util.Random;
import java.util.concurrent.*;

public class Test3 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Avg avg = new Avg();
        FutureTask<Integer> result = new FutureTask<>(avg);
        FutureTask<Integer> result2 = new FutureTask<>(avg);
        FutureTask<Integer> result3 = new FutureTask<>(avg);
        service.submit(result);
        service.submit(result2);
        service.submit(result3);

        service.shutdown();


        try {
            System.out.println(result.get());
            System.out.println(result2.get());
            System.out.println(result3.get());
            System.out.println((result.get()+result2.get()+result3.get())/3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}

class Avg implements Callable<Integer> {
    @Override
    public Integer call() {
        Random r = new Random();
        int sum = 0;
        Object lock = new Object();
        synchronized (lock) {
            for (int i = 0; i < 10; i++) {
                sum += (r.nextInt(100) + 1);
            }
            return (sum / 10);
        }

    }
}