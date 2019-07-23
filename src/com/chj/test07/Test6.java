package com.chj.test07;

import java.util.ArrayList;

class Teacher {
    private String name;
    private int age;
    private String like;

    public Teacher() {

    }

    public Teacher(String name, int age, String like) {
        this.name = name;
        this.age = age;
        this.like = like;
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

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public void show(){
        System.out.println(name+","+age+","+like);
    }
}


public class Test6 {

    public static void main(String[] args) {
        Teacher t1=new Teacher("姚小明",23,"打篮球");
        Teacher t2=new Teacher("景甜",28,"唱跳");
        Teacher t3=new Teacher("薛之谦",83,"RAP");

        ArrayList<Teacher> list=new ArrayList<>();

        list.add(t1);
        list.add(t2);
        list.add(t3);


        for(int i=0;i<list.size();i++){
            Teacher teacher=list.get(i);
            teacher.show();


            if (teacher.getAge()>=40){
                System.out.println("========================");
                teacher.show();
            }
        }



    }
}
