package com.chj.test24;

import java.util.stream.Stream;

public class Test13 {
    public static void main(String[] args) {
        Stream<Integer> b=Stream.of(10,20,30,40);

        Stream<String> c=b.map(String::valueOf);

        c.forEach(System.out::println);
    }

}
