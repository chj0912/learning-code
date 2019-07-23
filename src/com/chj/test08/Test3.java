package com.chj.test08;

public class Test3 {

    public static void main(String[] args) {
        String str="HelloWorld";

        System.out.println("字符串的长度："+str.length());

        char ch=str.charAt(2);
        System.out.println("索引值为2的字符："+ch);

        int index = str.indexOf("o");
        System.out.println("取字符串o第一次出现在该字符串内的索引:"+index);

        String s = str.substring(6);
        System.out.println("截取字符串str,从索引6开始到结束 :"+s);

        String s2=str.substring(2,7);
        System.out.println("截取字符串str,从索引2开始到索引7(不包含所以7):"+s2);

    }
}
