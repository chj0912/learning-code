package com.chj.test16;

public class Test11 {

    public static void main(String[] args) {
        DebitCard d=new DebitCard();
        try {
            d.setMoney(-1);
        } catch (NoMoney noMoney) {
            noMoney.printStackTrace();
        }
    }
}

class DebitCard{
    private String accountNumber;
    private double money;

    public DebitCard() {
    }

    public DebitCard(String accountNumber, double money) {
        this.accountNumber = accountNumber;
        this.money = money;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money)throws NoMoney {
        if(money<0){
            throw new NoMoney("余额为负数");
        }else {
            this.money = money;
        }
    }
}

class NoMoney extends Exception{
    public NoMoney() {
    }

    public NoMoney(String message) {
        super(message);
    }
}