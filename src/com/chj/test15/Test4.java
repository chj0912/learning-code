package com.chj.test15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        HashMap<String ,String> map=new HashMap<>();
        map.put("邓超","孙俪");
        map.put("李晨","范冰冰");
        map.put("刘德华","柳岩");
        map.put("黄晓明","Baby");
        map.put("谢霆锋","张柏芝");

        Set<String > set=map.keySet();

        Iterator<String> it=set.iterator();

        while (it.hasNext()){
            String str=it.next();
            System.out.println(str+"---->"+map.get(str));
        }



    }
}
