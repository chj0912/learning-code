package com.chj.test24;

import java.util.*;
import java.util.function.Function;

public class Test7 {
    public static void main(String[] args) {
        //求Integer类型Arraylist中所有元素的平均数
        Function<ArrayList<Integer>,Integer> f1 = (list)->{
            Integer sum = 0;
            for (Integer i : list) {
                sum+=i;
            }
            return sum/list.size();
        };

        //将Map<String,Integer>中value存到ArrayList<Integer>中
        Function<Map<String,Integer>,ArrayList<Integer>> f2= (map)->{
            ArrayList<Integer> list=new ArrayList<>();
            for(String str:map.keySet()){
                Integer i=map.get(str);
                list.add(i);
            }

            /*Collection<Integer> values=map.values();
            ArrayList<Integer> list=new ArrayList<>();
            list.addAll(values);*/
            return list;
        };

        Map<String ,Integer> map=new HashMap<>();
        map.put("曾小村",96);
        map.put("古天乐",59);
        map.put("渣渣灰",65);
        map.put("蓝筱月",84);
        map.put("皮皮虾",55);

        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(6);
        list.add(15);



        //利用Function求平均成绩
        Integer avg = f2.andThen(f1).apply(map);
        System.out.println("学生平均成绩为："+avg);


    }

}
