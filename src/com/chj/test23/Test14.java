package com.chj.test23;

import java.util.HashMap;
import java.util.function.Consumer;

public class Test14 {
    public static <T> void doJob(Consumer<T> consumer, T t) {
        consumer.accept(t);
    }

    public static <T> void doJob(Consumer<T> consumer1, Consumer<T> consumer2, T t) {
        consumer1.andThen(consumer2).accept(t);
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
//key:姓名 value:成绩•
        map.put("渣渣辉", 98);
        map.put("蓝小月", 65);
        map.put("皮几万", 70);
        map.put("岑小村", 59);
        map.put("谷天洛", 82);
// a)打印谷天洛的分数
// b)打印最高分
// c)分别以60分和70分为及格线，打印及格的人的名字



    }
}


