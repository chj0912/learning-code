package com.chj.test25;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;


public class Test9 {
    public static void main(String[] args) throws Exception {
        String pathname = "E:\\IdeaProjects\\JavaEE\\src\\com\\chj\\test25\\a.properties";
        File file = new File(pathname);
        Properties pro = new Properties();
        if (!file.exists()) {
            file.createNewFile();
        }
        FileInputStream fis=new FileInputStream(file);
        pro.load(fis);
        int count = 0;
        String value = pro.getProperty("count");
        if (value != null) {
            count = Integer.valueOf(value);
            if (count >=3) {
                System.out.println("次数用完");
                return;

            }
        }

        count++;
        pro.setProperty("count", count+"");
        FileOutputStream fos = new FileOutputStream(file);
        pro.store(fos,"");
        fos.close();


    }
}


