package com.chj.test08;

public class Test2 {

    public static void main(String[] args) {
        String str1="hello";
        String str2=new String("hello");
        String str3="Hello";

        if(str1.equals(str2)){
            System.out.println("str1与str2的内容相等");
        }else {
            System.out.println("str1与str2的内容不相等");
        }

        if(str1.equals(str3)){
            System.out.println("str1与str3的内容相等");
        }else {
            System.out.println("str1与str3的内容不相等");
        }

        if(str1.equalsIgnoreCase(str3)){
            System.out.println("str1与str3的内容相等");
        }else {
            System.out.println("str1与str3的内容不相等");
        }

        if(str1.startsWith("he")){
            System.out.println("字符串str1以he开头");
        }else {
            System.out.println("字符串str1不以he开头");
        }

        if(str1.startsWith("abc")){
            System.out.println("字符串str1以abc开头");
        }else {
            System.out.println("字符串str1不以abc开头");
        }

        if(str1.endsWith("o")){
            System.out.println("字符串str1以o结尾");
        }else {
            System.out.println("字符串str1不以o结尾");
        }

        if(str1.endsWith("l")){
            System.out.println("字符串str1以l结尾");
        }else {
            System.out.println("字符串str1不以l结尾");
        }


    }

}
