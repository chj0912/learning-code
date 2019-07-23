package com.chj.test12;

import java.util.ArrayList;
import java.util.Scanner;

public class Test10 {

    public static void main(String[] args) {
        System.out.println("欢迎使用超市购物系统");
        Scanner sc = new Scanner(System.in);

        ArrayList<Goods> list = goodsList();
        ArrayList<Shop> list1 = new ArrayList();

        boolean k = true;
        while (k) {
            System.out.println("请输入你要对应的操作：");
            System.out.println("=======================================================");
            System.out.println("1:购买商品" + "  " + "2:结算打印小票" + "  " + "3:退出系统");
            System.out.println("=======================================================");
            System.out.println("=======================================================");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    System.out.println("商品列表");
                    System.out.println("商品id" + "      " + "名称" + "       " + "单价" + "      " + "计价单位");
                    for (int j = 0; j < list.size(); j++) {
                        Goods goods = list.get(j);
                        System.out.println(goods.toString());
                    }
                    System.out.println("--------------------------------------------------------");

                    System.out.println("请输入你要购买的商品项：(格式：商品id-购买数量),输入end表示购买结束");
                    System.out.println("=========");

                    buy:
                    for (; true; ) {
                        String str = sc.next();
                        int index = str.indexOf("-");
                        if (str.equals("end")) {
                            System.out.println("结束购买");
                            break buy;
                        } else if (index == -1) {
                            System.out.println("你购买的姿势不对");
                            continue;
                        }else if(str.substring(index+1).indexOf("-")>=0){
                            System.out.println("你购买的姿势不对");
                            continue;
                        }else {

                            boolean b = false;
                            for (Goods g : list) {
                                if (str.substring(0, index).equals(g.getId())) {
                                    list1.add(new Shop(g.getName(), g.getPrice(), str.substring(index + 1)));
                                    System.out.println("购买成功");
                                    b = true;
                                }
                            }
                            if (b) {
                                continue;
                            } else {
                                System.out.println("无此商品或输入错误！");
                                continue;
                            }
                        }

                    }
                    break;

                case 2:
                    System.out.println("欢迎光临----------------------------------");
                    System.out.println("----------------------------------------");
                    System.out.println("名称" + "      " + "售价" + "       " + "数量" + "      " + "金额");
                    System.out.println("----------------------------------------");
                    double allpay = 0;
                    int num = 0;
                    for (Shop shop : list1) {
                        System.out.println(shop.toString());
                        allpay += shop.Pay();
                        num += Integer.valueOf(shop.getNum());
                    }
                    System.out.println("----------------------------------------");
                    System.out.println("共" + list1.size() + "件商品");
                    System.out.println("共计" + num + "件");
                    System.out.println("共" + allpay + "块钱");
                    System.out.println("----------------------------------------");
                    break;
                case 3:
                    k = false;
                    System.out.println("谢谢光临");
                    break;
                default:
                    System.out.println("输入有误");
                    break;
            }
        }
    }


    public static ArrayList<Goods> goodsList() {
        ArrayList<Goods> list = new ArrayList<>();
        Goods g1 = new Goods("001", "少林核桃", 15.5, "斤");
        Goods g2 = new Goods("002", "尚康饼干", 14.5, "包");
        Goods g3 = new Goods("003", "移动硬盘", 345.0, "个");
        Goods g4 = new Goods("004", "高清无码", 199.0, "G");

        list.add(g1);
        list.add(g2);
        list.add(g3);
        list.add(g4);

        return list;
    }


}

class Shop {
    private String name;
    private double price;
    private String num;
    private double pay;


    @Override
    public String toString() {
        return "" + name + "   " + price + "    " + num + "    " + getPrice() * Integer.valueOf(getNum());
    }

    public void pay() {
        double pay = getPrice() * Integer.valueOf(getNum());
    }

    public Shop() {
    }

    public Shop(String name, double price, String num) {
        this.name = name;
        this.price = price;
        this.num = num;
    }


    public double getPay() {
        return pay;
    }

    public double Pay() {
        this.pay = getPrice() * Integer.valueOf(getNum());
        return this.pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}

class Goods {
    private String id;
    private String name;
    private double price;
    private String units;


    public Goods() {
    }

    public Goods(String id, String name, double price, String units) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.units = units;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "" + getId() + "       " + getName() + "       " + getPrice() + "       " + getUnits() + "";
    }
}