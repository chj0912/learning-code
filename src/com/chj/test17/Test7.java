package com.chj.test17;

public class Test7 {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        new Thread(t, "窗口一").start();
        new Thread(t, "窗口二").start();
        new Thread(t, "窗口三").start();
        new Thread(t, "窗口四").start();


    }

}


class Ticket implements Runnable {
    int ticket = 10;
    int one = 1;
    int two = 1;
    int three = 1;
    int four = 1;
    Object lock = new Object();

    public void run() {
        String name = Thread.currentThread().getName();

        while (true) {
            synchronized (lock) {

                if (ticket <= 0) {
                    return;
                }

                try {
                    Thread.sleep(1000);


                    if (ticket > 0) {
                        if (name.equals("窗口一")) {
                            System.out.println(name + "卖了" + (one++) + "剩余" + (--ticket));
                        }
                        if (name.equals("窗口二")) {
                            System.out.println(name + "卖了" + (two++) + "剩余" + (--ticket));
                        }
                        if (name.equals("窗口三")) {
                            System.out.println(name + "卖了" + (three++) + "剩余" + (--ticket));
                        }
                        if (name.equals("窗口四")) {
                            System.out.println(name + "卖了" + (four++) + "剩余" + (--ticket));
                        }
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }


    }

}