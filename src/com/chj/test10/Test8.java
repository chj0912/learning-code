package com.chj.test10;

import javafx.scene.SnapshotParameters;

import java.util.ArrayList;

class Shop {
    ArrayList<Goods> list = new ArrayList<>();

    public void addGoods(Goods goods) {
        list.add(goods);
        System.out.println("加入 " + goods.getName() + " 成功");
    }

    public void removeGoods() {

    }

    public void pay() {


    }

    public void showGood() {
        System.out.println("购物车中的商品为：");
        for (int i = 0; i < list.size(); i++) {
            Goods goods = list.get(i);
            System.out.println("\t" + goods.getId() + "," + goods.getName() + "," + goods.getPrice());
        }
    }

    public void total() {
        double oldPrice = 0;//原价
        double newPrice = 0;//折扣价

        System.out.println("购物车所有商品的价格");
        for (int i = 0; i < list.size(); i++) {
            Goods goods = list.get(i);
            double price = goods.getPrice();
            oldPrice += price;
            if (goods instanceof EGoods) {
                price = goods.getPrice() * 0.88;
            }
            newPrice += price;
        }
        System.out.println("原价为：" + oldPrice);
        System.out.println("折扣价：" + newPrice);
    }
}


class Goods {
    private String name;
    private String id;
    private double price;

    public Goods() {
    }

    public Goods(String name, String id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


class EGoods extends Goods {
    public EGoods() {
    }

    public EGoods(String name, String id, double price) {
        super(name, id, price);
    }
}

class Laptop extends EGoods {
    public Laptop() {
    }

    public Laptop(String name, String id, double price) {
        super(name, id, price);
    }
}

class PhoneGoods extends EGoods {
    public PhoneGoods() {
    }

    public PhoneGoods(String name, String id, double price) {
        super(name, id, price);
    }
}

class Fruit extends Goods {
    public Fruit() {
    }

    public Fruit(String name, String id, double price) {
        super(name, id, price);
    }
}


public class Test8 {
    public static void main(String[] args) {
        Shop shop = new Shop();

        EGoods eGoods = new PhoneGoods("手机", "001", 100.52);
        EGoods eGoods1 = new Laptop("笔记本", "003", 10044.52);
        Goods fu = new Fruit("水果", "004", 52.52);

        System.out.println("============添加商品=================");
        shop.addGoods(eGoods);
        shop.addGoods(eGoods1);
        shop.addGoods(fu);

        System.out.println("============购物车的商品=================");
        shop.showGood();

        System.out.println("==================总价=================");
        shop.total();


    }
}
