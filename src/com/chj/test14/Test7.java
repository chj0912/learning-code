package com.chj.test14;

import java.util.HashSet;
import java.util.Objects;

public class Test7 {
    public static void main(String[] args) {
        HashSet<Persion> hash=new HashSet<>();
        hash.add(new Persion("张三",12));
        hash.add(new Persion("李四",17));
        hash.add(new Persion("蔡五",16));
        hash.add(new Persion("蔡五",16));

        for(Persion p:hash){
            System.out.println(p.toString());
        }



    }
}

class Persion{
    private String name;
    private int age;

    public Persion() {
    }

    public Persion(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persion persion = (Persion) o;
        return age == persion.age &&
                name.equals(persion.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
