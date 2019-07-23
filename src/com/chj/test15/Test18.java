package com.chj.test15;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test18 {
    public static void main(String[] args) {
        HashMap<String ,String > class1=new HashMap<>();
        HashMap<String ,String > class2=new HashMap<>();
        class1.put("001","李晨");
        class1.put("002","范冰冰");
        class2.put("001","马云");
        class2.put("002","马化腾");

        HashMap<String ,HashMap<String,String >> map=new HashMap<>();
        map.put("java基础班",class1);
        map.put("java就业班",class2);

        Set<String> set=map.keySet();
        for(String s:set){
            System.out.println(s+"-->"+map.get(s));
        }

        Set<Map.Entry<String ,HashMap<String,String >>> set1=map.entrySet();
        for(Map.Entry<String ,HashMap<String,String >> en:set1){
            System.out.println(en);
        }



    }
}
