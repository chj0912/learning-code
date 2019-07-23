package com.chj.test14;

import sun.plugin.javascript.navig.Link;

import java.util.LinkedList;

public class Test4 {
    public static void main(String[] args) {
        LinkedList<String> link=new LinkedList<>();
        link.add("1");
        link.add("2");
        link.addFirst("0");
        link.addLast("4");

        for(String str:link){
            System.out.println(str);
        }

        System.out.println("===============");

        System.out.println(link.getFirst());
        System.out.println(link.getLast());

        System.out.println("===============");
        link.removeFirst();
        link.removeLast();
        for(String str:link){
            System.out.println(str);
        }
    }

}
