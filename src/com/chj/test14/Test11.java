package com.chj.test14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Test11 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"a","f","b","c","a","d");

        HashSet<String> hash=new HashSet();
        hash.addAll(list);

        list.clear();

        list.addAll(hash);

        for(String str:list){
            System.out.println(str);
        }

    }


}
