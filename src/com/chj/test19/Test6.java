package com.chj.test19;

import java.io.*;

public class Test6 {
    public static void main(String[] args) {
        String pathname = "D:\\aaa\\b.txt";
        File file = new File(pathname);

        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(file), "GBK");
            BufferedReader bfreader = new BufferedReader(reader);
            String line;
            while ((line = bfreader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
