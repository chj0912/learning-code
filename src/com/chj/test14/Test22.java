package com.chj.test14;

import java.util.HashSet;
import java.util.Iterator;

public class Test22 {
    public static void main(String[] args) {
        HashSet<Student2> class1 = new HashSet<>();
        class1.add(new Student2("蔡洪杰", 18));
        class1.add(new Student2("蔡杰", 19));
        class1.add(new Student2("蔡洪", 20));

        HashSet<Student2> class2 = new HashSet<>();
        class2.add(new Student2("杰", 18));
        class2.add(new Student2("洪", 13));
        class2.add(new Student2("蔡", 20));


        HashSet<HashSet> project = new HashSet<>();
        project.add(class1);
        project.add(class2);

        for (HashSet<Student2> stu : project) {
            for (Student2 s : stu) {
                System.out.println(s.getName() + "  " + s.getAge());
            }
        }
        System.out.println("=====================================");
        Iterator<HashSet> it = project.iterator();

        while (it.hasNext()) {
            HashSet<Student2> stu = it.next();
            Iterator<Student2> it1 = stu.iterator();
            while (it1.hasNext()) {
                Student2 stu1 = it1.next();

                System.out.println(stu1.getName() + "  " + stu1.getAge());

            }

        }


    }

}

class Student2 {
    private String name;
    private int age;

    public Student2() {
    }

    public Student2(String name, int age) {
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
