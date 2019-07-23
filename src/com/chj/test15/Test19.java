package com.chj.test15;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test19 {
    public static void main(String[] args) {
        HashMap<String ,String > map=new HashMap<>();
        map.put("及时雨","松江");
        map.put("玉麒麟","卢俊义");
        map.put("智多星","吴用");


        map.remove("玉麒麟");

        map.put("智多星",null);

        Set<Map.Entry<String,String>> set=map.entrySet();
        for(Map.Entry<String,String> en:set){
            if(en.getKey().equals("及时雨")){
                map.put("呼保义",en.getValue());
                set.remove(en);
            }
        }



        System.out.println(map);

    }
}
