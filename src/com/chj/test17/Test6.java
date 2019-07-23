package com.chj.test17;

public class Test6 {

    public static void main(String[] args) {
        SellCup sc = new SellCup();
        new Thread(sc, "官网").start();
        new Thread(sc, "实体店").start();

    }


}


class SellCup implements Runnable {
    int cup = 100;
    int std = 0;
    int gw = 0;
    Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (cup <= 0) {
                    return;
                }
                try {
                    Thread.sleep(100);
                    String name = Thread.currentThread().getName();
                    if (name.equals("实体店")) {
                        std++;
                        System.out.println(name + "卖了第" + (100 - cup + 1) + "个，剩余：" + --cup);
                    }
                    if (name.equals("官网")) {
                        gw++;
                        System.out.println(name + "卖了第" + (100 - cup + 1) + "个，剩余：" + --cup);
                    }


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        }
    }
}