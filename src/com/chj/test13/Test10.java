package com.chj.test13;

import java.util.ArrayList;

public class Test10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("a");


        int c=frequency(list,"a");
        System.out.println("出现的次数为："+c);

    }

    public static int frequency(ArrayList<String> arrayList, String key) {
        int count = 0;
        for (String str : arrayList) {
            if(str.equals(key)){
                count+=1;
            }
        }
        return count;


    }

}


