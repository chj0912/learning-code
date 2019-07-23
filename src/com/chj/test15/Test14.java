package com.chj.test15;

import java.util.HashMap;
import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        HashMap<String ,Integer> map=new HashMap<>();
        String []s=str.split(" ");
        for(String st:s) {
            if (map.containsKey(st)) {
              map.put(st,map.get(st)+1);
            }else {
                map.put(st,1);
            }
        }
        System.out.println(map);
    }
}
