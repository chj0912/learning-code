package com.chj.test14;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Test8 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("王昭君");
        lhs.add("王昭君");
        lhs.add("西施");
        lhs.add("杨玉环");
        lhs.add("貂蝉");


        Iterator<String> it=lhs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("================");

        for(String str:lhs){
            System.out.println(str);
        }
    }
}
