package com.chj.test19;

import java.io.File;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
        String name = "D:\\bbb";
        File file = new File(name);

        if (file.exists()) {
            System.out.println("文件夹已存在");
        } else {
            try {
                file.createNewFile();
                System.out.println("文件夹创建成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
