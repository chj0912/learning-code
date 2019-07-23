package com.chj.test12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test6 {
    public static void main(String[] args) throws ParseException {
        String str="1996-01-12";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=sdf.parse(str);
        long time= date.getTime();
        Date d=new Date();
        long t=d.getTime();

        long life=t-time;

        System.out.println("我活了："+life/1000/60/60/24+"天");


    }



}
