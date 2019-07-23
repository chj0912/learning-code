package com.chj.test13;

public class Test6 {

    public static void main(String[] args) {
       printT("asdsd");
       printT(13212);

    }

   public static  <T> void printT(T t){
       System.out.println(t);
    }
}
