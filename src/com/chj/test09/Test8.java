package com.chj.test09;

abstract class Employee1 {
    private String id;
    private String name;

    abstract void work();

    public Employee1() {
    }

    public Employee1(String id, String name) {
        this.id = id;
        this.name = name;
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
}

abstract class Teacher2 extends Employee1 {
    public Teacher2() {
    }

    public Teacher2(String id, String name) {
        super(id, name);
    }
}


abstract class AdminStaff extends Employee1 {
    public AdminStaff() {
    }

    public AdminStaff(String id, String name) {
        super(id, name);
    }
}

class Lecturer extends Teacher2 {
    public Lecturer() {
    }

    public Lecturer(String id, String name) {
        super(id, name);
    }

    @Override
    void work() {
        System.out.println("工号：" + getId() + "的讲师：" + getName() + "在讲课");
    }
}

class Tutor extends Teacher2 {
    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name);
    }

    @Override
    void work() {
        System.out.println("工号：" + getId() + "的助教：" + getName() + "在解决问题");

    }
}

class Maintainer extends AdminStaff {
    public Maintainer() {
    }

    public Maintainer(String id, String name) {
        super(id, name);
    }

    @Override
    void work() {
        System.out.println("工号：" + getId() + "的维护专员：" + getName() + "在解决屏幕不能共享");
    }
}

class Buyer extends AdminStaff {
    public Buyer() {
    }

    public Buyer(String id, String name) {
        super(id, name);
    }

    @Override
    void work() {
        System.out.println("工号："+getId()+"的采购专员："+getName()+"在买东西");
    }
}

public class Test8 {
    public static void main(String[] args) {
        Lecturer l=new Lecturer("0001","蔡先生");
        Tutor t=new Tutor("0003","蜘蛛侠");
        Maintainer m=new Maintainer("455","庖丁");
        Buyer b=new Buyer("444","景甜");

        l.work();
        t.work();
        m.work();
        b.work();
    }
}
