package com.chj.test23;

import java.util.Arrays;
import java.util.Comparator;

public class Test10 {

    public static void main(String[] args) {
        String[] stringsArray = {"Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael",
                "Linda"};

        /*Arrays.sort(stringsArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        */

        Arrays.sort(stringsArray,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(stringsArray));
    }

}
