package com.chj.test18;

import java.util.Random;

public class Test10 {
    public static void main(String[] args) {
        Persion p=new Persion();
        new SetPerson("赋值",p).start();
        new PrintPersion("打印",p).start();
        




    }


}

class PrintPersion extends Thread {
    private Persion persion;

    public PrintPersion(String name ,Persion persion) {
        super(name);
        this.persion=persion;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (persion) {
                if (persion.isPersion==true) {
                    System.out.println(persion.getName() + "==" + persion.getSex());
                } else {
                    try {
                        persion.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                persion.isPersion=false;
                persion.notify();
            }

        }
    }
}


class SetPerson extends Thread {

    private Persion persion;

    public SetPerson(String name ,Persion persion) {
        super(name);
        this.persion=persion;
    }

    @Override
    public void run() {
        Random r=new Random();
        while (true) {
            synchronized (persion) {
                if (persion.isPersion==true) {
                    try {
                        persion.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (r.nextInt(3) % 2 == 0) {
                    persion.setName("蔡某");
                    persion.setSex("男");
                } else {
                    persion.setName("孙某");
                    persion.setSex("女");
                }
                persion.isPersion = true;
                persion.notify();
            }

        }
    }
}


class Persion {
    private String name;
    private String sex;
    boolean isPersion = false;

    public Persion() {
    }

    public Persion(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}