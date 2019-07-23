package com.chj.test14;

import java.util.ArrayList;

public class Test10 {
    public static void main(String[] args) {
        ArrayList<String> list=add("2","4","8","4");

        for(String str:list){
            System.out.println(str);
        }

    }


    public static ArrayList<String> add(String...str){
             ArrayList<String> array=new ArrayList<>();

             for(String s:str){
                 array.add(s);
             }
           return array;

    }

}
