package com.chj.test14;

import java.util.ArrayList;
import java.util.Collections;

public class Test9 {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,33,11,77,55);
        for(Integer i:list){
            System.out.println(i);
        }

        System.out.println("============");

        Collections.sort(list);
        for(Integer i:list){
            System.out.println(i);
        }
        System.out.println("============");

        Collections.shuffle(list);
        for(Integer i:list){
            System.out.println(i);
        }
        System.out.println("============");

        Collections.reverse(list);
        for(Integer i:list){
            System.out.println(i);
        }

     }

}
