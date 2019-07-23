package com.chj.test16;

public class Test6 {
    public static void main(String[] args) {

        try {
            char c = charAt("java", 3);
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static char charAt(String str, int index) throws Exception {

        if (str==null) {
            throw new Exception("字符串不能为null");
        } else if (str.equals(" ")) {
            throw new Exception("字符串不能为空");
        } else if (index < 0 || index > str.length() - 1) {
            throw new Exception("索引越界");
        } else {
            char[] c = str.toCharArray();
            return c[index];
        }

    }

}
