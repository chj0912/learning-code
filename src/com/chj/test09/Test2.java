package com.chj.test09;



class persion {
    String name;
    int age;

    public void eat() {
        System.out.println(name + "在吃饭");
    }

    public void sleep() {
        System.out.println(name + "在睡觉");
    }
}

class Teacher extends persion {


    public void work() {
        System.out.println(name + "在上课");
    }
}

class Coder extends persion {

    public void do_() {
        System.out.println(name + "打代码");
    }
}


public class Test2 {


    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "蔡洪杰";
        teacher.age = 22;
        teacher.eat();
        teacher.sleep();
        teacher.work();


        Coder coder=new Coder();
        coder.name="蔡";
        coder.age=23;
        coder.eat();
        coder.sleep();
        coder.do_();


    }
}
