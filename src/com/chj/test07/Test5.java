package com.chj.test07;

import java.util.ArrayList;

class Student {
    private String id;
    private String name;
    private double height;

    public Student() {

    }

    public Student(String id, String name, double height) {
        this.id = id;
        this.name = name;
        this.height = height;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void show() {
        System.out.println(id + "," + name + "," + height);
    }

}


public class Test5 {


    public static void main(String[] args) {

        Student s1 = new Student("it001", "黄渤", 1.72);
        Student s2 = new Student("it002", "孙红雷", 1.78);
        Student s3 = new Student("it003", "章子怡", 1.64);
        Student s4 = new Student("it004", "杨颖", 1.68);

        ArrayList<Student> stu = new ArrayList<>();

        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);

        System.out.println("集合的大小：" + stu.size());

        for (int i = 0; i < stu.size(); i++) {
            Student student = stu.get(i);
            student.show();

        }
        System.out.println("==========================================");
        System.out.println("身高1.70以上的学员：");
        for (int i = 0; i < stu.size(); i++) {
            Student student = stu.get(i);
            if(student.getHeight()>=1.70){
                student.show();
            }

        }



    }
}
