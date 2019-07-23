package com.chj.test15;

import java.util.HashMap;
import java.util.Set;

public class Test9 {
    public static void main(String[] args) {
        HashMap<String , Double> map=new HashMap<>();
        map.put("柳岩",2100.0);
        map.put("张亮",1700.0);
        map.put("诸葛亮",1800.0);
        map.put("灭绝师太",2600.0);
        map.put("东方不败",3800.0);

        Double i=map.get("柳岩");
        i+=300;
        map.put("柳岩",i);
        Set<String> set=map.keySet();

        for(String str:set){
            double d =map.get(str);
            System.out.println(str+"---->"+d);
        }






    }
}
