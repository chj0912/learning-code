package com.chj.test24;

import java.util.*;

public class Test8 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");


        list.stream().forEach(System.out::println);

        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        set.stream().forEach(System.out::println);

        Map<String,Integer> map=new HashMap<>();
        map.put("曾小村",96);
        map.put("古天乐",59);
        map.put("渣渣灰",65);
        map.put("蓝筱月",84);
        map.put("皮皮虾",55);

        map.keySet().stream().forEach(System.out::println);


    }
}
