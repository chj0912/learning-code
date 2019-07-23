package com.chj.test10;
interface Money{
    abstract void paySalary(Employee employee);
}
class Employee{
    private String name;
    private double pay;

    public Employee() {
    }

    public Employee(String name, double pay) {
        this.name = name;
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public void pay(){
        System.out.print("给"+getName()+"发工资："+getPay());
    }
}

class Manager extends Employee{
    public Manager() {
    }

    public Manager(String name, double pay) {
        super(name, pay);
    }


}

class Coder extends Employee{
    public Coder() {
    }

    public Coder(String name, double pay) {
        super(name, pay);
    }
}

class Company implements Money{
    private double allMoney=1000000.11;

    @Override
    public void paySalary(Employee employee) {
           allMoney=allMoney-employee.getPay();

        System.out.println("公司账户总余额为："+allMoney);
    }
}


public class Test7 {

    public static void main(String[] args) {
        Coder coder=new Coder("老蔡",12020.41);
        coder.pay();
        Manager manager=new Manager("王多鱼",10000.11);

        Company company=new Company();
        company.paySalary(coder);
        manager.pay();
        company.paySalary(manager);

    }
}
