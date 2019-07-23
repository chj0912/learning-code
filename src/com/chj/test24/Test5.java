package com.chj.test24;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student stu1=new Student("蔡洪杰",20,78);
        Student stu2=new Student("洪杰",15,96);
        Student stu3=new Student("蔡杰",24,60);
        Student stu4=new Student("蔡洪",18,80);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        List list1=filter(list,s->s.getAge()<=20,
                s->s.getGrade()>=80);

        System.out.println(list1);


    }

    public static List filter(ArrayList<Student> list, Predicate<Student> one,Predicate<Student> two){
        ArrayList<Student> list1=new ArrayList<>();
        for(Student stu:list){
            if(one.and(two).test(stu)){
                list1.add(stu);
            }
        }
        return list1;
    }





}



class Student{
    private String name;
    private int age;
    private int grade;

    public Student() {
    }

    public Student(String name, int age, int grade) {
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
