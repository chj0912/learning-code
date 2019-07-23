package com.chj.test09;

abstract class Poultry{
    private int age;
    private String coler;

    abstract void eat();

    public Poultry() {
    }

    public Poultry(int age, String coler) {
        this.age = age;
        this.coler = coler;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColer() {
        return coler;
    }

    public void setColer(String coler) {
        this.coler = coler;
    }
}

class Rooster extends Poultry{

    void crow(){
        System.out.println(getAge()+"岁的"+getColer()+"的公鸡在打鸣");
    }
    void eat(){
        System.out.println(getAge()+"岁的"+getColer()+"的公鸡在啄米");
    }
}

class Duck extends Poultry{

    void swing(){
        System.out.println(getAge()+"岁的"+getColer()+"的鸭子在打鸣");
    }
    void eat(){
        System.out.println(getAge()+"岁的"+getColer()+"的鸭子在吃鱼");
    }
}

public class Test6 {
    public static void main(String[] args) {
        Rooster r=new Rooster();
        Duck d=new Duck();
        r.setAge(2);
        r.setColer("蓝色");
        d.setAge(1);
        d.setColer("白色");

        r.eat();
        r.crow();

        d.eat();
        d.swing();


    }

}
