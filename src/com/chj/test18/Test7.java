package com.chj.test18;

public class Test7 {
    public static void main(String[] args) {
           invokeCalc(120 ,130,(int a,int b)->{
                  return a+b;
           });
    }

    private static void invokeCalc(int a,int b,Calculator calc){
        int result=calc.calc(a,b);
        System.out.println("结果是："+result);
    }

}
interface Calculator{
    int calc(int a,int b);
}

