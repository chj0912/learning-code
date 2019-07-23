package com.chj.test14;

import java.util.HashSet;
import java.util.Iterator;

public class Test20 {
    public static void main(String[] args) {
        HashSet<Student1> set=new HashSet<>();
        set.add(new Student1("蔡先生",18,96.5));
        set.add(new Student1("蔡",28,96.5));
        set.add(new Student1("蔡生",58,97.5));
        set.add(new Student1("生",17,94.5));
        set.add(new Student1("先生",19,99.5));
        double sum=0;

        Iterator<Student1> it=set.iterator();
        double max=0;
        double min=100;


        for(Student1 stu:set){
            sum+=stu.getGrade();
            if(max<stu.getGrade()){
                max=stu.getGrade();
            }
            if(min>stu.getGrade()){
                min=stu.getGrade();
            }
        }
        System.out.println("总分："+sum);
        System.out.println(max);
        System.out.println(min);
        System.out.println("平均值："+sum/set.size());


    }
}

class Student1{

    private String name;
    private int age;
    private double grade;

    public Student1() {
    }

    public Student1(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}