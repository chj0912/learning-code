package com.chj.test17;

public class Test4 {
    public static void main(String[] args) {
        Runnable r=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println("播放背景音乐");
                }
            }
        };
        new Thread(r).start();

        new Thread(){
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println("显示画面");
                }
            }
        }.start();

    }



}
