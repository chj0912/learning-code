package com.chj.test17;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        PassMo pm=new PassMo();
        ArrayList<String> list=new ArrayList<>();
        list.add("蔡洪杰0");
        list.add("蔡洪杰1");
        list.add("蔡洪杰2");
        list.add("蔡洪杰3");
        list.add("蔡洪杰4");
        list.add("蔡洪杰5");
        list.add("蔡洪杰6");
        list.add("蔡洪杰7");
        list.add("蔡洪杰8");
        list.add("蔡洪杰9");
        list.add("蔡洪杰10");

        for(String s:list){
            Thread t=new Thread(pm,s);
            t.start();
        }

    }


}

class PassMo implements Runnable{
    Object lock=new Object();
    @Override
    public void run() {
        synchronized (lock){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("通过山洞的是"+Thread.currentThread().getName());
        }
    }
}