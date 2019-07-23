package com.chj.test21;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test7 {
    public static void main(String[] args) throws IOException {
        Student s=new Student();
        s.setName("²Ìºé½Ü");
        s.setAge(15);
        s.setSex("ÄÐ");
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\student.txt"));

        oos.writeObject(s);

        oos.close();

        System.out.println("±£´æ³É¹¦");

    }
}


class Student implements Serializable{
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
}