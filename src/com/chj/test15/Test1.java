package com.chj.test15;

import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) {
        HashMap<String,String> map =new HashMap<>();

        map.put("钢铁侠","蜘蛛侠");
        map.put("黑寡妇","鹰眼");
        System.out.println(map);
        map.put("钢铁侠","小辣椒");
        System.out.println(map);


        System.out.println(map.get("钢铁侠"));

        map.remove("黑寡妇");
        System.out.println(map);

    }

}
