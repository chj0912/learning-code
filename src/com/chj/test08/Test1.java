package com.chj.test08;

public class Test1 {
    public static void main(String[] args) {
        String str1 = new String("你好");
        System.out.println("方式一创建的数组：" + str1);

        char[] chs = {'H', 'e', 'l', 'l', 'o'};
        String str2 = new String(chs);
        System.out.println("方式二创建的数组：" + str2);

        byte[] byt = {'H', 'e', 'l', 'l', 'o'};
        String str3 =new String(byt);
        System.out.println("方式三创建的数组：" + str3);

    }


}
