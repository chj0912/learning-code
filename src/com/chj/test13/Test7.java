package com.chj.test13;

public class Test7 {
    public static void main(String[] args) {
        ImplTnter im = new ImplTnter();
        im.show("sadfasfsdfsd");

        ImplInter2<Integer> im2=new ImplInter2<>();
        im2.show(1223465465);

    }
}

interface Inter<E> {
    abstract void show(E e);
}


//定义实现类确定泛型类型
class ImplTnter implements Inter<String> {

    @Override
    public void show(String e) {
        System.out.println(e);
    }
}
//定义实现类但不确定泛型类型
class ImplInter2 <E> implements Inter<E>{

    public void show(E e){
        System.out.println(e);
    }
}