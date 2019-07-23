package com.chj.test12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test8 {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd");
        String str="2016-12-18";

        Date date=simpleDateFormat.parse(str);
        simpleDateFormat.applyPattern("yyyy年MM月dd日");

        System.out.println(simpleDateFormat.format(date));
    }


}
