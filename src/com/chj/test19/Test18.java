package com.chj.test19;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pathname = sc.nextLine();
        File file = new File(pathname);
        Map<String, Integer> map = new HashMap<>();
        getFile(file, map);

        Set<String> set = map.keySet();
        for (String str : set) {
            System.out.println(str + "--->" + map.get(str));
        }


    }

    public static void getFile(File file, Map<String, Integer> map) {

        File[] files1 = file.listFiles();
        for (File file1 : files1) {
            if (file1.isFile()) {
                if (file1.getName().contains(".")) {
                    String name = file1.getName();
                    String[] str = name.split("\\.");
                    if (map.size() < 1) {
                        map.put(str[1], 1);
                    } else {
                        if (isHaveKey(map,str)) {
                            map.put(str[1], map.get(str[1]) + 1);
                        }else {
                            map.put(str[1], 1);
                        }
                    }
                }
            } else {
                getFile(file1, map);
            }

        }
    }

    public static boolean isHaveKey(Map<String, Integer> map,String[] str) {
        boolean b=false;
        Set<String> set=map.keySet();
        for(String s:set){
            if(map.containsKey(str[1])){
                  b=true;
                  return b;
            }
        }
        return b;
    }
}

