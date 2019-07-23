package com.chj.test23;


import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Random;
import java.util.function.Supplier;

public class Test13 {
    public static void main(String[] args) {

        /*String [] str=new String[5];
        Random r=new Random();
        HashSet<Integer> set=new HashSet<>();
        set.add(r.nextInt(20)+1);
        set.add(r.nextInt(20)+1);
        set.add(r.nextInt(20)+1);
        set.add(r.nextInt(20)+1);
        set.add(r.nextInt(20)+1);
        Calendar c=Calendar.getInstance();
        c.set(2018,04,01);*/

        getObj(() -> new String[5]);



    }

    public static <T> T getObj(Supplier<T> supplier) {
        return supplier.get();
    }


}
