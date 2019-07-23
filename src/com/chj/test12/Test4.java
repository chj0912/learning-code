package com.chj.test12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        String str="1996-01-12";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=sdf.parse(str);
        System.out.println(date);
    }
}
