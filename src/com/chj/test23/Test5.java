package com.chj.test23;

public class Test5 {

    public static void main(String[] args) {

        Son son = new Son();
        son.daJiangYou();

    }


}

@FunctionalInterface
interface Helper {
    void help();
}

class Father {
    public void askMoney() {
        System.out.println("买家庭物资");
    }

    public void spendMoney() {
        System.out.println("打酱油");
    }
}

class Son extends Father {
    @Override
    public void askMoney() {
        System.out.println("拿钱上网");
    }

    @Override
    public void spendMoney() {
        System.out.println("去网吧");
    }

    public void helpFather(Helper helper) {
        helper.help();
    }


    public void daJiangYou() {
        helpFather(super::askMoney);
        helpFather(super::spendMoney);

    }
}