package com.chj.test24;

public class Test2 {
    public static void main(String[] args) {
        getEatable(()-> System.out.println("我在吃饭呢"));
        int s= getSumable(5,6,(int a,int b)->a+b);
        System.out.println(s);

    }
    public static void getEatable(Eatable eatable){
        eatable.eat();
    }
    public static int getSumable(int a,int b,Sumable sumable){
        return sumable.sum(a,b);
    }

}

@FunctionalInterface
interface Eatable{
   abstract void eat();
}

@FunctionalInterface
interface Sumable{
   abstract int sum(int a,int b);
}