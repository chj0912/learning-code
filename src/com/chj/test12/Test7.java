package com.chj.test12;

public class Test7 {
    public static void main(String[] args) {
        String str="";
        long stat=System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            str+="哈";
        }
        long end=System.currentTimeMillis();
        System.out.println(str);
        System.out.println("花费了："+(end-stat)+"秒");

        StringBuffer sb=new StringBuffer();
        long stat1=System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            sb.append("哈");
        }
        long end1=System.currentTimeMillis();
        System.out.println(sb);
        System.out.println("花费了："+(end1-stat1)+"秒");
    }

}
