package com.chj.test16;

import java.util.Random;

public class Test12 {
    public static void main(String[] args) {

        MyThread myThread=new MyThread("新的线程");
        myThread.start();

        System.out.println("========");
        Random r=new Random();
        int sum=0;
        for(int i=0;i<10;i++){
            sum+= r.nextInt(901)+100;
        }
        System.out.println("main"+sum);



    }

}

class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        Random r=new Random();
        int sum=0;
        for(int i=0;i<10;i++){
           sum+= r.nextInt(901)+100;
        }
        System.out.println(sum);



    }
}