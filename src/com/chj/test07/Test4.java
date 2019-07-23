package com.chj.test07;

import java.util.ArrayList;

public class Test4 {

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        String a1="孙悟空";
        String a2="铁扇公主";
        String a3="沙和尚";
        String a4="唐僧";

        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);

        System.out.println(list.get(3));

        list.set(3,"唐三藏");
        list.remove(1);

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


    }



}
