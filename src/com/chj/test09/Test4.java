package com.chj.test09;

class Persion {
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
}

class Teacher1 extends Persion {
    private String subject;

    public Teacher1() {
    }

    public Teacher1(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void work(){
        System.out.println(getName()+"讲授"+subject+"课");
    }
}

class Student extends Persion{
    private double grade;

    public Student() {
    }

    public Student(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void test(){
        System.out.println(getName()+"考试得了："+grade+"分");
    }
}


public class Test4 {
    public static void main(String[] args) {
          Teacher1 t=new Teacher1();
          t.setName("老王");
          t.setSubject("java");
          t.work();

          Student s=new Student();
          s.setName("小蔡");
          s.setGrade(99);
          s.test();


    }
}
