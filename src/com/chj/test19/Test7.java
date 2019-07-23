package com.chj.test19;

import java.io.File;

public class Test7 {
    public static void main(String[] args) {
        File file = new File("D:\\IntelliJ IDEA 2018.3.6");

       /* String [] names=file.list();

        for(String name:names){
            System.out.println(name);
        }
*/
        File[] filenames = file.listFiles();

        for (File file1 : filenames) {
            System.out.println(file1);
        }


    }


}
