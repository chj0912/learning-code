package com.chj.test14;

import java.util.*;

public class Test21 {
    public static void main(String[] args) {
        HashSet<String> red=new HashSet<>();
        HashSet<String> bule=new HashSet<>();
        HashSet<String> ball=new HashSet<>();
        Random r=new Random();

        while (red.size()<32){
            red.add("红色"+(r.nextInt(33)+1));
        }

        while (bule.size()<15){
            bule.add("蓝色"+(r.nextInt(16)+1));
        }


        Iterator<String > it=red.iterator();
        while (ball.size()<6){
           ball.add(it.next());

        }
        Iterator<String > it1=bule.iterator();
        while (ball.size()<7){
            ball.add(it1.next());
        }

        for(String s:ball){
            System.out.println(s);
        }

    }

}
