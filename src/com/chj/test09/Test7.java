package com.chj.test09;

abstract class Employee{
    private String id;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    abstract void work();
    abstract void eat();
}

class Manager extends Employee{


    void work() {
        System.out.println("工号为"+getId()+"姓名为："+getName()+"工资为："+getSalary()+"在工作");
    }


    void eat() {
        System.out.println("工号为"+getId()+"姓名为："+getName()+"工资为："+getSalary()+"在吃鱼");
    }
}

class Chef extends Employee{


    void work() {
        System.out.println("工号为"+getId()+"姓名为："+getName()+"工资为："+getSalary()+"在炒菜");
    }


    void eat() {
        System.out.println("工号为"+getId()+"姓名为："+getName()+"工资为："+getSalary()+"在吃肉");
    }
}

public class Test7 {
    public static void main(String[] args) {
        Manager m=new Manager();
        m.setId("001");
        m.setName("老蔡");
        m.setSalary(10000.14);
        m.eat();
        m.work();

        Chef c=new Chef();
        c.setId("003");
        c.setName("蔡大厨");
        c.setSalary(10000.11);
        c.eat();
        c.work();

    }
}
