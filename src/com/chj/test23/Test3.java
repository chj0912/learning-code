package com.chj.test23;

public class Test3 {
    public static void main(String[] args) {
        decToHex(79,Integer::toHexString);

    }

    public static void decToHex(int num,NumberConversion nc){
        System.out.println(nc.conver(num));
    }

}


@FunctionalInterface
interface NumberConversion{
    abstract String conver(int num);
}