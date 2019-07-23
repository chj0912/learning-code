package com.chj.test06;

class Manaher{
    private String name;
    private String id;
    private int money;
    private int bonus;

    public Manaher() {

    }

    public Manaher(String name, String id, int money, int bonus) {
        this.name = name;
        this.id = id;
        this.money = money;
        this.bonus = bonus;
    }

    public void intro(){
        System.out.println("经理姓名："+name);
        System.out.println("工号："+id);

    }

    public void showSalary(){
        System.out.println("基本工资："+money+"奖金为："+bonus);

    }

    public void work(){
        System.out.println("坐在老板椅上吹空调");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}

class Coder{
    private String name;
    private String id;
    private int money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public Coder(){

    }
    public Coder(String name,String id,int money){
        this.name=name;
        this.id=id;
        this.money=money;
    }
    public void intro(){
        System.out.println("程序员名称："+name);
        System.out.println("工号："+id);

    }
    public void showSalary(){
        System.out.println("基本工资："+money);

    }

    public void work(){
        System.out.println("正在苦逼的打代码");
    }

}

public class Test6 {
    public static void main(String[] args) {
        Manaher manaher=new Manaher("蔡经理","9527",10000,1000);
        manaher.intro();
        manaher.showSalary();
        manaher.work();
        System.out.println("===============");

        Coder coder=new Coder("蔡程序员","555",5000);
        coder.intro();
        coder.showSalary();
        coder.work();
    }
}
