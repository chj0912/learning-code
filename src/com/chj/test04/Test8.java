package com.chj.test04;

public class Test8 {


    public static void main(String[] args) {
        double hs = 60.0;
        double ss = 30.0;

        System.out.println("摄氏度为：" + ss + "°" + "华氏度为：" + convertHs(ss) + "°");
        System.out.println("华氏度为：" + hs + "°" + "摄氏度为：" + convertSs(hs) + "°");
    }

    public static double convertHs(double ss) {
        double hs = (9.0 / 5) * ss + 32;
        return hs;
    }

    public static double convertSs(double hs) {
        double ss = (hs - 32) / (9.0 / 5);
        return ss;
    }
}
