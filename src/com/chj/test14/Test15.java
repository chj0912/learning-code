package com.chj.test14;

import java.util.ArrayList;
import java.util.HashSet;

public class Test15 {
    public static void main(String[] args) {
        String []arr={"abc","bad","abc","aab","bad","cef","jhi"};
        ArrayList<String> list=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        for(String s:arr){
            set.add(s);
        }
        for(String s:set){
            list.add(s);
        }
        for(String s:list){
            System.out.println(s);
        }

    }
}
