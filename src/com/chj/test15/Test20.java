package com.chj.test15;

import java.util.*;

public class Test20 {
    public static void main(String[] args) {
        HashSet<String> num = new HashSet<>();
        HashSet<String> firult = new HashSet<>();
        firult.add("苹果");
        firult.add("香蕉");
        firult.add("西瓜");
        firult.add("橘子");

        Random random = new Random();
        while (num.size() < firult.size()) {
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < 8; i++) {
                str.append(random.nextInt(10));
            }
            int n = Integer.parseInt(str.toString());
            num.add(n + "");
        }

        HashMap<String, String> map = new HashMap<>();

        Iterator<String> it1=num.iterator();
        Iterator<String> it2=firult.iterator();

        while (it2.hasNext()){
            map.put(it1.next(),it2.next());
        }
        System.out.println(map);
        Scanner sc=new Scanner(System.in);
        Set<String> set=map.keySet();
        for(String s:set){
            if(s.equals(sc.nextLine())){
                System.out.println("根据商品号"+s+"查询此商品为："+map.get(s));
            }else {
                System.out.println("查无此商品");
            }
        }




    }
}
