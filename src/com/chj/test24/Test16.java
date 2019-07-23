package com.chj.test24;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test16 {
    public static void main(String[] args) {
        Stream<String> a=Stream.of("100","200","300","400","500");

        List<String> list=a.collect(Collectors.toList());

        System.out.println(list);

        Set<String> set=a.collect(Collectors.toSet());

        System.out.println(set);

        String[] str=a.toArray(String[]::new);

        Arrays.stream(str).forEach(System.out::println);


    }

}
