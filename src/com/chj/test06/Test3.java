package com.chj.test06;

class Teacher {
    String name;
    int age;
    String content;

    public void eat() {
        System.out.println("在吃饭");
    }

    public void teach() {
        System.out.println(content);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getContent() {
        return content;
    }
}

class Student {
    String name;
    String content;
    int age;

    public void eat() {
        System.out.println("吃西瓜");
    }

    public void study() {
        System.out.println(content);
    }

    public void student(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getContent() {
        return content;
    }
}

public class Test3 {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("蔡老师");
        teacher.setAge(23);
        teacher.setContent("打代码");
        System.out.println("年龄为：" + teacher.age + "的" + teacher.name);
        teacher.eat();
        teacher.teach();

        Student student = new Student();
        student.student("蔡同学", 20, "看蔡老师打代码");
        System.out.println("年龄为：" + student.age + "的" + student.name);
        student.eat();
        student.study();

    }

}


