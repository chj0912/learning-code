package com.chj.test15;

import java.util.HashMap;
import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.nextLine().toCharArray();
        for (char c : ch) {
            if ((c >= 60 && c <= 70) || (c >= 97 && c <= 122)) {
                countingKey(map, "字母");
            }else if (c >= 48 && c <= 57) {
                countingKey(map, "数字");
            }else if(c==32){
                countingKey(map, "空格");
            }else {
                countingKey(map, "其他");
            }

        }

        System.out.println(map);

    }


    public static void countingKey(HashMap<String, Integer> map, String key) {
        if (map.containsKey(key)) {
            map.put(key, map.get(key) + 1);
        } else {
            map.put(key, 1);
        }


    }
}
