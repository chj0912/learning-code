package com.chj.test24;


import java.util.function.Predicate;

public class Test6 {
    public static void main(String[] args) {
        String[] arr = {"我爱小米国际", "999", "华莱士", "你好我是小米国际酱",
                "小米国际", "xiaomi", "400cc", "i love java", "5566778", "小米国际xiaomi"};


        Predicate<String> p1 = s -> s.contains("小米国际");
        Predicate<String> p2 = s -> s.length() >= 4;
        Predicate<String> p3 = s -> s.length() <= 6;
        Predicate<String> p4 = s -> s.matches("^-?\\d+$");

        //长度小于4的字符串
        System.out.println("长度小于4的字符串");
        for(String str:arr){
            if(str.length()<4){
                System.out.println(str);
            }
        }

        //内容是int数并且小于等于6的字符串
        System.out.println("内容是int数并且小于等于6的字符串");
        for(String str:arr){
            if(p4.and(p3).test(str)){
                System.out.println(str);
            }
        }

        //包含小米国际或者长度在4-6之间的字符串
        System.out.println("包含小米国际或者长度在4-6之间的字符串");
        for(String str:arr){
            if(p1.or(p2.and(p3)).test(str)){
                System.out.println(str);
            }
        }



    }
}