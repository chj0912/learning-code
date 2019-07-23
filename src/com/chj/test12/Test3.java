package com.chj.test12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) {
        Date date =new Date();
        SimpleDateFormat adf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str=adf.format(date);
        System.out.println(str);
    }

}
