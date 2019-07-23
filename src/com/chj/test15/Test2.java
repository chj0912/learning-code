package com.chj.test15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"蔡洪杰");
        map.put(2,"蔡洪");
        map.put(3,"杰");
        map.put(4,"洪杰");
        map.put(5,"蔡杰");

        Set<Integer> set=map.keySet();
        for (Integer i:set){
            System.out.println(i);
        }

        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

     }
}
