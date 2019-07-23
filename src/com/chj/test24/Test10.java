package com.chj.test24;

import java.util.stream.Stream;

public class Test10 {


    public static void main(String[] args) {
        Stream<String> original=Stream.of("柯镇恶", "朱聪", "韩宝驹", "南希仁", "张阿生", "全金发", "韩小莹");
        System.out.println(original.count());
    }
}
