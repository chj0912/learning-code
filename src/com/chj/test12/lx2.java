package com.chj.test12;

import java.util.Calendar;

public class lx2 {
    public static void main(String[] args) {
        gettime();
        settime();
        add();
        getTime();
    }

    public static void gettime() {

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;//返回月份 从0开始
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);//某月的第几天


        System.out.println(year + "年" + month + "月" + dayOfMonth + "日");
    }

    public static void settime() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2030);
        System.out.println(cal.getTime());
    }

    public static void add() {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());

        cal.add(Calendar.DAY_OF_MONTH, 2);
        cal.add(Calendar.YEAR, -3);
        System.out.println(cal.getTime());
    }

    public static void getTime() {

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
    }

}

