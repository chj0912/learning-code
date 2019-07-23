package com.chj.test14;

import java.util.Collections;
import java.util.HashSet;

public class Test12 {

    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        Collections.addAll(hashSet,"张三","李四","王五","二丫","钱六","孙七");
        for(String str:hashSet){
            System.out.println(str);
        }

        System.out.println("==============");
        hashSet.remove("二丫");

        for(String str:hashSet){
            System.out.println(str);
        }
        System.out.println("==============");

        hashSet.add("王小丫");

        for(String str:hashSet){
            System.out.println(str);
        }

    }


}
