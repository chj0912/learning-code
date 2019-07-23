package com.chj.test12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class lx1 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入你的出生日期：（格式：yyyy—mm-dd）");
        Scanner sc = new Scanner(System.in);
        //获取生日字符串
        String yourBirthday=sc.next();
        //设置日期格式
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        //格式化日期
        Date birthdayDate = simpleDateFormat.parse(yourBirthday);

        //获取当前日期
        Date date =new Date();

        //获取生日的毫秒值
        long birthdayTime=birthdayDate.getTime();
        //获取当前日期的毫秒值
        long dateTime= date.getTime();


        long day=dateTime-birthdayTime;

        if(day<0){
            System.out.println("还没出生呢");
        }else {
            System.out.println("出生了："+day/1000/60/60/24+"天");
        }


    }

}
