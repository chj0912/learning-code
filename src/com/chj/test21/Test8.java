package com.chj.test21;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test8 {
    public static void main(String[] args)throws IOException {
        Student s=null;
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\student.txt"));

        ois.read();

        try {
            s=(Student) ois.readObject();
            System.out.println(s.getName()+s.getSex()+s.getAge());

            ois.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
