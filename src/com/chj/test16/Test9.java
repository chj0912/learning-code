package com.chj.test16;

public class Test9 {
    public static void main(String[] args) {

        Persion p=new Persion();
        p.setLifeValue(-1);

    }
}

class Persion{
    private String name;
    private int lifeValue;

    public Persion() {
    }

    public Persion(String name, int lifeValue) {
        this.name = name;
        this.lifeValue = lifeValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue)throws NolifeValueExpiton {
        if(lifeValue<0){
           throw new NolifeValueExpiton("生命值不能为负数"+lifeValue);
        }else {
            this.lifeValue = lifeValue;
        }


    }
}


class NolifeValueExpiton extends RuntimeException{
    public NolifeValueExpiton() {
    }

    public NolifeValueExpiton(String message) {
        super(message);
    }
}