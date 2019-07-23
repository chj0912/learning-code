package com.chj.test15;

import sun.invoke.empty.Empty;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test5 {
    public static void main(String[] args) {
        HashMap<String ,String> map=new HashMap<>();
        map.put("邓超","孙俪");
        map.put("李晨","范冰冰");
        map.put("刘德华","柳岩");
        map.put("黄晓明","Baby");
        map.put("谢霆锋","张柏芝");



        Set<Map.Entry<String,String>> entrySet=map.entrySet();

        Iterator<Map.Entry<String,String>> it=entrySet.iterator();

        while (it.hasNext()){

            System.out.println(it.next());
        }



    }
}
