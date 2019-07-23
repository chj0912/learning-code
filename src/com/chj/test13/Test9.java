package com.chj.test13;

import java.util.ArrayList;
import java.util.Iterator;

public class Test9 {
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

        double maxHeight=0;
        double minHeight=200;
        String persion1 = null;
        String persion2 = null;
        Iterator<Persion> it=list.iterator();

        while (it.hasNext()){
            Persion persion=it.next();
            if(maxHeight<persion.getHeight()){
                maxHeight=persion.getHeight();
                persion1=persion.toString();
            }

            if (minHeight>persion.getHeight()){
                minHeight=persion.getHeight();
                persion2=persion.toString2();
            }

        }

        System.out.println(persion1);
        System.out.println(persion2);





    }
}





class Persion{
    private String name;
    private int age;
    private double height;

    public Persion() {
    }

    public Persion(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "最高的人是" + name +

                "身高" + height;
    }

    public String toString2() {
        return "最矮的人是" + name +

                "身高" + height;
    }
}