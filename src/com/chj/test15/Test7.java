package com.chj.test15;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Test7 {
    public static void main(String[] args) {
        HashMap<String,Student> map=new HashMap<>();
        map.put("广东省茂名市",new Student("蔡洪杰",18));
        map.put("广东省广州市",new Student("蔡杰",18));
        map.put("广东省东莞市",new Student("洪杰",18));
        map.put("广东省深圳市",new Student("蔡洪",18));

        Set<String> set=map.keySet();
        for(String str:set){
            System.out.println(str+"---->"+map.get(str));
        }

        Set<Map.Entry<String,Student>> entrySet=map.entrySet();
        for(Map.Entry<String,Student> entry:entrySet){
            System.out.println(entry);
        }


    }

}

class Student1{

    private String name;
    private int age;


    public Student1() {
    }

    public Student1(String name, int age) {
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
        if (!(o instanceof Student1)) return false;
        Student1 student1 = (Student1) o;
        return age == student1.age &&
                name.equals(student1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
