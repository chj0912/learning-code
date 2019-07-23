package com.chj.test13;

import java.util.ArrayList;
import java.util.Collections;

public class Test13 {
    public static void main(String[] args) {
        ArrayList<String> hs = new ArrayList<>();
        ArrayList<String> ds = new ArrayList<>();

        hs.add("♦");
        hs.add("♠");
        hs.add("♣");
        hs.add("♥");

        ds.add("K");
        ds.add("Q");
        ds.add("J");
        ds.add("A");
        for (int i = 2; i <= 10; i++) {
            ds.add(i + "");
        }

        ArrayList<String> p = new ArrayList<>();


        p.add("大🃏");
        p.add("小🃏");

        for (String h : hs) {
            for (String d:ds){
                String card=h+d;
                p.add(card);
            }
        }
        //洗牌。。
        Collections.shuffle(p);

        //发牌。。
        ArrayList<String> player1=new ArrayList<>();
        ArrayList<String> player2=new ArrayList<>();
        ArrayList<String> player3=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();


        for(int j=0;j<p.size();j++){
            if(j>=51){
                dipai.add(p.get(j));
            }else if(j%3==0) {
                player1.add(p.get(j));
            }else if(j%3==1){
                player2.add(p.get(j));
            }else {
                player3.add(p.get(j));

            }
        }

        System.out.println("player1"+player1);
        System.out.println("player2"+player2);
        System.out.println("player3"+player3);
        System.out.println("底牌"+dipai);

        boolean a=nadipai(player1);
        boolean b=nadipai(player2);
        boolean c=nadipai(player3);

        if(a){
            player1.add(dipai.get(0));
            player1.add(dipai.get(1));
            player1.add(dipai.get(2));
        }
        if (b){
            player2.add(dipai.get(0));
            player2.add(dipai.get(1));
            player2.add(dipai.get(2));
        }
        if (c){
            player3.add(dipai.get(0));
            player3.add(dipai.get(1));
            player3.add(dipai.get(2));
        }
        System.out.println("===============================================================");
        System.out.println("player1"+player1);
        System.out.println("player2"+player2);
        System.out.println("player3"+player3);

    }
    public static boolean nadipai(ArrayList<String> list){
        for (String str:list){
            String s=str;
           if (s.equals("大🃏")){
               return true;
           }else {
               continue;
           }

        }
        return false;
    }

}
