package com.chj.test06;

class Circle {
    private int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Circle() {

    }

    public Circle(int r) {
        this.r = r;
    }

    public void showArea() {

        System.out.printf("圆的面积为"+"%.2f", (3.14 * r * r));
        System.out.println("");

    }

    public void showPerimeter() {
        System.out.println("圆的周长为：" + 2 * 3.14 * r);
    }


}


public class Test5 {

    public static void main(String[] args) {
        Circle circle = new Circle(6);
        circle.showArea();
        circle.showPerimeter();
    }
}
