package com.chj.test15;

import java.util.*;

public class Test15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random r=new Random();

        HashMap<String ,Integer> map=new HashMap<>();

        while (map.size()<5){
            String name=sc.next();
            map.put(name,r.nextInt(101));
        }
        int max=0;
        int min=100;
        int sum=0;

        Set<String> set=map.keySet();
        for(String str:set){
            if(max<map.get(str)){
                max=map.get(str);
            }
            if(min>map.get(str)){
                min=map.get(str);
            }

            sum+=map.get(str);
        }
        System.out.println(map);
        System.out.println(sum);
        System.out.println("平均分："+sum/map.size());
        System.out.println(max);
        System.out.println(min);
    }
}
