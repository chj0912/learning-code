package com.chj.test21;

import java.io.*;
import java.util.ArrayList;

public class Test11 {
    public static void main(String[] args)throws IOException {
        Student stu1= new Student("²Ì",16,"ÄÐ");
        Student stu2= new Student("²Ì1",16,"ÄÐ");
        Student stu3= new Student("²Ì2",16,"ÄÐ");
        Student stu4= new Student("²Ì3",16,"ÄÐ");
        Student stu5= new Student("²Ì4",16,"ÄÐ");

        ArrayList<Student> list=new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\student.txt"));

        for(Student stu:list){
            oos.writeObject(stu);
        }
        oos.close();
        System.out.println("¶ÔÏó±£´æ³É¹¦");





    }


}
