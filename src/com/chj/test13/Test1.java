package com.chj.test13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
        Collection<Integer> collection=new ArrayList();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);

            System.out.println("集合的内容：");
        for(Integer in:collection){
            System.out.println(in);
        }

        ((ArrayList<Integer>) collection).remove(3);

            System.out.println("删除后的内容：");
        for(Integer in:collection){
            System.out.println(in);
        }

        System.out.println("长度："+collection.size());

        collection.clear();

        Iterator<Integer> it=collection.iterator();

        while (it.hasNext()){
            System.out.println("清空："+it.next());
        }



    }

}
