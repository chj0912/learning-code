package com.chj.test18;

import java.util.*;

public class Test9 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        Map<Integer,Integer> map=new HashMap<>();

        list.add(1);
        list.add(2);
        list.forEach((list1)-> System.out.println(list1));


        set.add(3);
        set.add(4);
        set.forEach((set1)-> System.out.println(set1));

        map.put(5,6);
        map.put(7,8);
        map.forEach((k,v)->{
            System.out.println(k+"="+v);
        });

    }

}
