package com.chj.test15;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test6 {
    public static void main(String[] args) {
        HashMap<Student,String> map=new HashMap<>();
        map.put(new Student("蔡洪杰",18),"广东省茂名市");
        map.put(new Student("蔡杰",18),"广东省广州市");
        map.put(new Student("洪杰",18),"广东省东莞市");
        map.put(new Student("蔡洪",18),"广东省深圳市");

        Set<Student> set=map.keySet();
        for(Student stu:set){
            System.out.println(stu+"---->"+map.get(stu));
        }

        Set<Map.Entry<Student,String>> entrySet=map.entrySet();
        for(Map.Entry<Student,String> entry:entrySet){
            System.out.println(entry);
        }


    }

}

class Student{

    private String name;
    private int age;


    public Student() {
    }

    public Student(String name, int age) {
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
