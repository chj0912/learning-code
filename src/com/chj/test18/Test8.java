package com.chj.test18;

import java.util.Arrays;
import java.util.Comparator;

public class Test8 {
    public static void main(String[] args) {
        Student s1=new Student("小明",96.5);
        Student s2=new Student("小话",90.4);
        Student s3=new Student("小熊",92.5);
        Student s4=new Student("小狗",60.4);
        Student[] stu={s1,s2,s3,s4};

        Arrays.sort(stu,(stu1,stu2)->{
            return (int)stu1.getGrade()-(int) stu2.getGrade();
        });

        for(Student student:stu){
            System.out.println(student.getName()+student.getGrade());
    }

    }


}


class Student{

    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }



}