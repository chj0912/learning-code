package com.chj.test14;

import java.util.HashSet;
import java.util.Iterator;

public class Test5 {
    public static void main(String[] args) {
        HashSet<String> hash=new HashSet<>();
        hash.add("你好嗯");
        hash.add("你好哦");
        hash.add("你好呀");

        Iterator<String> it=hash.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }



}
