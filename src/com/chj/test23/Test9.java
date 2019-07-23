package com.chj.test23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test9 {
    public static void main(String[] args) {
    ArrayList<Student> list=new ArrayList<>();
    Student stu1=new Student("谢霆锋",85);
    Student stu2=new Student("章子怡",63);
    Student stu3=new Student("刘亦菲",77);
    Student stu4=new Student("黄晓明",33);
    Student stu5=new Student("陈小春",92);

    list.add(stu1);
    list.add(stu2);
    list.add(stu3);
    list.add(stu4);
    list.add(stu5);

     /*   Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getScore()-o2.getScore();
            }
        });*/

        Collections.sort(list,(o1,o2)->o1.getScore()-o2.getScore());

        for(Student s:list){
            System.out.println(s.toString());
        }


    }


}


class Student{
    private String name;
    private int score;

    public Student() {
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}