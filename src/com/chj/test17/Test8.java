package com.chj.test17;

public class Test8 {
    public static void main(String[] args) {
        UpBuss ub=new UpBuss();
        new Thread(ub,"一号门").start();
        new Thread(ub,"二号门").start();
        new Thread(ub,"三号门").start();
    }
}


class UpBuss implements Runnable {
    int capacity = 80;
    Object lock = new Object();

    public void run(){
        while (true){
            synchronized (lock){
                if(capacity<0){
                   return;
                }
                if(capacity>0){
                    try {
                        Thread.sleep(2000);
                        System.out.println(Thread.currentThread().getName()+"上人啦，"+"车上还有座位数为"+--capacity);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}