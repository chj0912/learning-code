package com.chj.test09;

class Animal{
    String name;
    String coler;
    double price;

    public void eat(){
        System.out.println(name+"在吃饭");
    }

}

class Dog extends Animal{


    public void work() {
        System.out.println(name+"在看家");
    }
}

class Cat extends Animal{

    public void do_(){
        System.out.println(name+"抓老鼠");
    }
}

public class Test3 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.name="旺财";

        Cat cat=new Cat();
        cat.name="TOM";

        dog.eat();
        dog.work();
        cat.eat();
        cat.do_();

    }
}
