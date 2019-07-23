package com.chj.test06;

class Dog {
    private String name;
    private int age;

    public Dog() {

    }

    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void showMsg() {
        System.out.println("狗的名称：" + name + "年龄：" + age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public class Test2 {


    }

    public static void main(String[] args) {
        Dog dog = new Dog("旺财", 2);
        dog.showMsg();
    }
}

