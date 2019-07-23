package com.chj.test14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.Callable;

public class Test19 {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        Collections.addAll(list1,"a","b","a","c","d");
        Collections.addAll(list2,"e","f","a","d","g");

        HashSet<String> set=new HashSet<>();
        for (String s:list1){
            set.add(s);
        }
        for(String s:list2){
            set.add(s);
        }
        for(String s:set){
            System.out.println(s);
        }

    }
}
