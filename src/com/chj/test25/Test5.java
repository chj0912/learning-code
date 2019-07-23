package com.chj.test25;

import java.util.Scanner;

public class Test5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入类的全名：");
        String str=sc.nextLine();
        try {
            Class c=Class.forName("com.chj.test25."+str);
            A a=(A)c.newInstance();
            a.showString();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }


}


class A {
    public void showString() {

        System.out.println("打印");
    }
}