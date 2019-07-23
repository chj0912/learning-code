package com.chj.test10;
abstract class Animal{
    private String name;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    abstract void eat();

}

class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("狗吃骨头");
    }

    void lookHome(){
        System.out.println("看家");
    }
}

class Cat extends Animal{
    @Override
    void eat() {
        System.out.println("猫吃鱼");
    }
    void catchMouse(){
        System.out.println("抓老鼠");
    }
}

public class Test5 {
    public static void main(String[] args) {
          Animal dog=new Dog();
          Animal cat=new Cat();

          dog.eat();
          cat.eat();


          if(dog instanceof Dog){
              Dog d=(Dog) dog;
              d.lookHome();
          }
          if(cat instanceof Cat){
              Cat c=(Cat) cat;
              c.catchMouse();

          }

    }

}
