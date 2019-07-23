package com.chj.test15;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char []ch=str.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(Character c:ch){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }

        StringBuffer sb=new StringBuffer();
        StringBuffer result=null;

        Set<Character> set=map.keySet();
        for(Character c:set){
            Integer num=map.get(c);
            result=sb.append(c).append("("+num+")");
        }
        System.out.println(result);


    }
}
