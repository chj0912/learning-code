package com.chj.test24;

import java.util.stream.Stream;

public class Test9 {

    public static void main(String[] args) {
        Stream<String> original=Stream.of("黄药师", "冯蘅", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏");

        original.filter(s -> s.startsWith("郭")).forEach(System.out::println);
    }
}
