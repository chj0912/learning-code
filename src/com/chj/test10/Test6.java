package com.chj.test10;

abstract class Persion{
    private String name;
    private int age;

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

    abstract void eat();
}

interface Sport{
    public void playBasketball();
}

class Teacher extends Persion{
    @Override
    void eat() {
        System.out.println("");
    }
}

class Student extends Persion{
    @Override
    void eat() {
        System.out.println("");
    }
}

class SportTeacher extends Teacher implements Sport{

    @Override
    public void playBasketball() {
        System.out.println(getAge()+getName()+"的老师在打篮球哦");
    }
}

class SportStudent extends Student implements Sport{

    @Override
    public void playBasketball() {
        System.out.println(getAge()+getName()+"的学生在打篮球哦");
    }
}

public class Test6 {
    public static void main(String[] args) {
        SportTeacher t1=new SportTeacher();
        t1.setName("老王");
        t1.setAge(55);

        SportTeacher t2=new SportTeacher();
        t2.setName("老蔡");
        t2.setAge(30);


        SportStudent s1=new SportStudent();
        s1.setName("55");
        s1.setAge(55);

        SportStudent s2=new SportStudent();
        s2.setName("55");
        s2.setAge(30);

        gotoSport(t1);
        gotoSport(t2);
        gotoSport(s1);
        gotoSport(s2);




    }

    public static void gotoSport(Sport sport){
           sport.playBasketball();
    }
}
