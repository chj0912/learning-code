package com.chj.test17;

public class Test3 {
    public static void main(String[] args) {
        /*MyThread mt=new MyThread("线程1");
        mt.start();*/


        MyThread mt=new MyThread();
        Thread t=new Thread(mt,"线程1");
        t.start();
    }

}

//继承Thread类
/*
class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName());
    }
}*/

//实现Runnable接口
class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}