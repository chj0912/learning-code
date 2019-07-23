package com.chj.test10;
interface A{
    abstract void showA();
    public default void showB(){}
}

class B implements A{
    @Override
    public void showA() {
        System.out.println("aaa");
    }

    @Override
    public void showB() {
        System.out.println("bbb");
    }
}

public class Test2 {
    public static void main(String[] args) {
        B b=new B();
        b.showA();
        b.showB();
    }


}
