package com.chj.test14;

import java.util.LinkedList;

public class Test3 {

    public static void main(String[] args) {
        LinkedList<String > link=new LinkedList<>();
        link.add("hello");
        link.add("world");
        link.add("bey");
        link.add(1,"element");
        link.set(2,"beybey");
        System.out.println(link.get(3));
        System.out.println(link.size());
        for(String str:link){
            System.out.println(str);
        }
        link.remove(1);
        for(String str:link){
            System.out.println(str);
        }

    }
}
