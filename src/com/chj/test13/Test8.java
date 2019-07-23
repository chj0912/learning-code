package com.chj.test13;

import java.util.ArrayList;
import java.util.Iterator;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu = new Student("蔡先生", 23, 98.6);
        Student stu1 = new Student("蔡洪杰", 27, 99.6);
        Student stu2 = new Student("蔡小杰", 25, 95.7);
        Student stu3 = new Student("蔡杰洪", 21, 98.6);
        Student stu4 = new Student("蔡大杰", 63, 98);

        list.add(stu);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        Iterator<Student> it = list.iterator();
        int sum = 0;
        double maxGrade=0;
        double minGrade=100;
        while (it.hasNext()) {
            Student student = it.next();
            System.out.println(student.getName() + student.getAge() + student.getGrade());
            sum += student.getGrade();
            if(maxGrade<student.getGrade()){
                maxGrade=student.getGrade();
            }
            if(minGrade>student.getGrade()){
                minGrade=student.getGrade();
            }
        }
        System.out.println(sum);
        System.out.println(sum / list.size());
        System.out.println(maxGrade);
        System.out.println(minGrade);

    }
}


class Student {
    private String name;
    private int age;
    private double grade;

    public void Student() {

    }

    public Student(String name, int age, double grade) {
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