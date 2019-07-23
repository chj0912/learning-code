package com.chj.test09;
abstract class A{
    int numa=10;

    abstract void showA();

}
abstract class B extends A{
    int numb=20;

    abstract void showB();

}

class C extends B{
    int numc=30;

    void showA() {
        System.out.println("A中的numa："+numa);
    }

    void showB() {
        System.out.println("b中的numb："+numb);

    }
    void showC() {
        System.out.println("c中的numc："+numc);

    }
}
public class Test5 {
    public static void main(String[] args) {
        C c=new C();
        c.showA();
        c.showB();
        c.showC();

    }
}
