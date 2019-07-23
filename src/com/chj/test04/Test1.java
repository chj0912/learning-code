package com.chj.test04;

public class Test1 {

    public static void main(String[] args) {
        printEvent(20);
    }

    public static void printEvent(int n){
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

}
