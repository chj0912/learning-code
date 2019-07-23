package com.chj.test14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Test14 {
    public static void main(String[] args) {
        HashSet<Student> set=new HashSet<>();
        set.add(new Student("小明",17,"男"));
        set.add(new Student("小明",18,"男"));
        set.add(new Student("小白",19,"女"));
        set.add(new Student("小花",16,"男"));
        set.add(new Student("小明",18,"男"));
        set.add(new Student("小k",17,"女"));
        set.add(new Student("小明",14,"男"));
        set.add(new Student("小卡",18,"女"));
        set.add(new Student("小明",15,"男"));
        set.add(new Student("小u",18,"女"));


        Iterator<Student> it=set.iterator();

         while (it.hasNext()){
             Student student=it.next();
             System.out.println(student.toString());
         }

        System.out.println("===============");

         for(Student stu:set){
             System.out.println(stu.toString());
         }
    }

}

class Student{
    private String name;
    private int age;
    private String sex;

    public Student() {
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age &&
                name.equals(student.name) &&
                sex.equals(student.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}