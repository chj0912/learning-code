package com.chj.test25;


import java.util.Properties;

public class Test8 {

    public static void main(String[] args) {
        try {
            Properties pro = new Properties();
            pro.load(Test8.class.getResourceAsStream("/com/chj/test25/p.properties"));
            String className = pro.getProperty("class");
            Class c = Class.forName(className);
            C t = (C) c.newInstance();
            t.run();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }





}


class C{
    public void run() {
        System.out.println("Every one!");
    }
}