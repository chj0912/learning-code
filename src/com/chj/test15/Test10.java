package com.chj.test15;

import java.util.HashMap;

public class Test10 {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"张三丰");
        map.put(2,"周芷若");
        map.put(3,"汪峰");
        map.put(4,"灭绝师太");

        System.out.println(map);

        map.putIfAbsent(5,"李晓红");

        map.remove(1);
        map.put(2,"周林");
        System.out.println(map);


    }


}
