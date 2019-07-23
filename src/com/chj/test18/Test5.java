package com.chj.test18;


public class Test5 implements Runnable {
    public static void main(String[] args) {
         Thread t=new Thread(new Test5());
         t.start();
    }


    public void run(int num){
        for(int i=0;i<num;i++){
            System.out.println(i);
        }
    }

    @Override
    public void run() {

    }
}
