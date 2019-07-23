package com.chj.test24;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("张三丰");
        list.add("三丰");
        list.add("张三");

        List list1 =filterStudent(list, s->s.startsWith("张"),
                s->s.length()==2);

        System.out.println(list1);
    }


    public static List filterStudent(ArrayList<String> list, Predicate<String> one,Predicate<String > two){
        ArrayList<String > list1=new ArrayList<>();
        for(String info:list)
            if (one.and(two).test(info)) {
                list1.add(info);
            }
         return list1;
    }
}

