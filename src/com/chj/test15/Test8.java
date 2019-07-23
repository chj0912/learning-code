package com.chj.test15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,String> map=new HashMap<>();

        Set<Map.Entry<String,String>> set=map.entrySet();
        while (set.size()<5){
            String str=sc.next();
            String s=str.substring(0,str.indexOf("，"));
            String ss=str.substring((str.indexOf("，")+1));
            map.put(s,ss);
        }

        System.out.println(map);


    }
}

