/*
package com.chj.test10;
interface AA{
    abstract void showA();

    //JDK 9才有private属性
    private void show10(String str){
        for (int i=0;i<10;i++){
            System.out.println(str);
        }
    }

    public default void showB10(String str){
        show10(str);
    }
    public default void showC10(String str){
        show10(str);
    }
}

class BB implements AA{
    @Override
    public void showA() {

    }

}

public class Test3 {
    public static void main(String[] args) {
        BB bb=new BB();
        bb.showA();
        bb.showB10("asdghasgfg");
        bb.showC10("ajkbkjajaas");
    }

}
*/
