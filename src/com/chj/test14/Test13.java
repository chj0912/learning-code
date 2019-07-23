package com.chj.test14;


import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Test13 {
    public static void main(String[] args) {
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        LinkedList<String> linkedList =new LinkedList();
        for(String s:strs){

            if(linkedList.contains(s)){
                continue;
            }else {
                linkedList.add(s);
            }

        }
        System.out.println("=============");

        for (String str:linkedList){
            System.out.println(str);
        }

        /*System.out.println("=============");

        Iterator<String> it=linkedList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
*/
    }
}
