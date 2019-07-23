package com.chj.test04;

public class Test6 {
    public static void main(String[] args) {

        printX();
    }

    public static void printX(){
        for (int i=1;i<=7;i++){
            for (int j=1;j<=7;j++){
                if (i==j||i+j==8){
                    System.out.print("O");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }


    }
}
