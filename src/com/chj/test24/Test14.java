package com.chj.test24;

import java.util.stream.Stream;

public class Test14 {
    public static void main(String[] args) {

        Stream<String> a=Stream.of("郭靖","杨康");
        Stream<String> b=Stream.of("黄蓉","穆念慈");

        Stream<String> concat=Stream.concat(a,b);

        concat.forEach(System.out::println);

    }
}
