package com.chj.test13;

import java.util.ArrayList;

public class Test5 {

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("xiaoming");
        list.add("xiaoming2");
        list.add("xiaoming3");
        list.add("xiaoming4");
        list.add("xiaoming5");

        for(String str:list){
            System.out.println(str);
        }


    }
}
