package com.chj.test25;

public class Test4_1 {
    public static void main(String[] args) {
        Class c=Test4.class;

        try {

            Test4 t=(Test4) c.newInstance();
            t.show();


        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


    }


}
