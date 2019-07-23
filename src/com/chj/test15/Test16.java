package com.chj.test15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test16 {
    public static void main(String[] args) {
        HashMap<String ,Double> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        while (map.size()<5){
            String str=sc.nextLine();
            String bookname=str.substring(0,str.indexOf(","));
            Double price=Double.parseDouble(str.substring(str.indexOf(",")+1));
            map.put(bookname,price);
        }


        map.remove("C++");

        map.put("java",38.5);

        Set<String> set=map.keySet();
        for(String s:set){
            System.out.println(s+"--->"+map.get(s));
        }

        Set<Map.Entry<String ,Double>> se=map.entrySet();
        for (Map.Entry<String ,Double> en:se){
            System.out.println(en);
        }

    }

}
