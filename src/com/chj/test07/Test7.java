package com.chj.test07;

import java.util.ArrayList;

class Worker {
    private String id;
    private String name;
    private int age;

    public Worker() {
    }

    public Worker(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public void show() {
        System.out.println(id + "," + name + "," + age);
    }
}


public class Test7 {
    public static void main(String[] args) {
        Worker w1 = new Worker("bz", "黄渤", 45);
        Worker w2 = new Worker("bz", "孙洪利", 35);
        Worker w3 = new Worker("bz", "罗志祥", 55);

        ArrayList<Worker> list = new ArrayList<>();

        list.add(w1);
        list.add(w2);
        list.add(w3);

        findMaxAge(list);
    }

    public static void findMaxAge(ArrayList<Worker> workers) {
        Worker w;
        int index = 0;
        for (int i = 0; i < workers.size(); i++) {
            w = workers.get(i);
            int temp = w.getAge();
            if (w.getAge() >= temp) {
                index = i;
            }
        }
        w = workers.get(index);
        System.out.println("最高年龄的对象：");
        w.show();

    }

}
