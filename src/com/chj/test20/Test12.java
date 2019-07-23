package com.chj.test20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test12 {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        properties.load(new FileInputStream("D:\\score.txt"));
        Set<String> set = properties.stringPropertyNames();
        for (String s : set) {
            if (s.equals("lisi")) {
                properties.setProperty(s, "100");
            }
            FileOutputStream fos = new FileOutputStream("D:\\score.txt");
            properties.store(fos, null);
            fos.close();

        }
    }

}


