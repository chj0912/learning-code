package com.chj.test15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,2);
        map.put(3,4);
        map.put(5,6);
        map.put(7,8);
        System.out.println( map.values());

        Set<Integer> set=map.keySet();
        for(Integer i:set){
            System.out.println(map.get(i));
        }


        Iterator<Integer> it=set.iterator();
        while (it.hasNext()){
            System.out.println(map.get(it.next()));
        }

    }
}
