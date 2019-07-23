package com.chj.test15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test13 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bcd");

        HashMap<Character, Integer> map = new HashMap<>();

        for (String str : list) {

            char[] ch = str.toCharArray();

            for (char c : ch) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }
        System.out.println(map);
    }

}
