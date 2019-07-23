package com.chj.test24;

import java.util.stream.Stream;

public class Test12 {
    public static void main(String[] args) {
        Stream<String> a = Stream.of("承炫风", "梅超风", "陆乘风", "曲风零", "雾面峰", "封魔风", "程婴");

        a.limit(2).forEach(System.out::println);
    }
}