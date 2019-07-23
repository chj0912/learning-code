package com.chj.test13;

import java.util.ArrayList;
import java.util.Iterator;

public class Test12 {
    public static void main(String[] args) {
        ArrayList<Persion> list=new ArrayList<>();
        Persion p=new Persion("甲",22,168.6);
        Persion p1=new Persion("乙",26,170.2);
        Persion p2=new Persion("丙",22,188.1);
        Persion p3=new Persion("戊",24,165.3);
        Persion p4=new Persion("丁",21,198.5);
        list.add(p);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        Iterator<Persion> it=list.iterator();
        while (it.hasNext()){
            Persion persion=it.next();
            persion.setAge(persion.getAge()+2);
        }
        for(Persion pp:list){
            System.out.println(pp.getName()+pp.getAge()+"  "+pp.getHeight());
        }
    }

}


