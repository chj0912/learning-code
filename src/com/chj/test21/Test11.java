package com.chj.test21;

import java.io.*;
import java.util.ArrayList;

public class Test11 {
    public static void main(String[] args)throws IOException {
        Student stu1= new Student("��",16,"��");
        Student stu2= new Student("��1",16,"��");
        Student stu3= new Student("��2",16,"��");
        Student stu4= new Student("��3",16,"��");
        Student stu5= new Student("��4",16,"��");

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
        System.out.println("���󱣴�ɹ�");





    }


}
