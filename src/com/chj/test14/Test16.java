package com.chj.test14;

import java.util.HashSet;
import java.util.Random;

public class Test16 {

    public static void main(String[] args) {
        Random random=new Random();
        HashSet<Integer> set=new HashSet<>();

        while (set.size()<10){
            set.add(random.nextInt(21));
        }

        for(Integer i:set){
            System.out.println(i);
        }

    }
}
