package com.chj.test25;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test3 {
    public static void main(String[] args) {
        //通过Class对象创建Student对象
        Class c = Student.class;
        try {


            Student student = (Student) c.newInstance();
            System.out.println(student.name);

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        //通过Constructor对象的方法创建
        try {
            Constructor<Student> constructor = c.getDeclaredConstructor();

            Student stu = constructor.newInstance();
            System.out.println(stu.name);


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }

}

class Student {
    String name = "蔡";

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }
}