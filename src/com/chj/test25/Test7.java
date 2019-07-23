package com.chj.test25;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test7 {
    public static void main(String[] args) throws Exception{

        Class c=Person.class;

        Person person=(Person) c.newInstance();
        person.setName("蔡");
        person.setAge(18);


        Method method=c.getMethod("setName", String.class);

        method.invoke(person,"洪杰");


        Field field=c.getDeclaredField("age");
        field.setAccessible(true);
        field.set(person,19);



        System.out.println(person.getAge());
        System.out.println(person.getName());




    }


}



class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}