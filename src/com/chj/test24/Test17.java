package com.chj.test24;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test17 {
    public static void main(String[] args) {
        String [] str={"java","ui","python","c++"};

        Stream<String> s=Stream.of(str);
        List<String> list=s.collect(Collectors.toList());
        System.out.println(list);

    }

}
