package com.chj.test15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Test21 {

    public static void main(String[] args) {
        HashMap<Integer,String> porkcard =new HashMap<>();

        ArrayList<String> color=new ArrayList<>();
        ArrayList<String> number=new ArrayList<>();

        Collections.addAll(color,"♠","♥","♣","♦");
        Collections.addAll(number,"K","Q","J","A","2","3","4","5","6","7","8","9","10");

        int count=1;
        porkcard.put(count++,"大🃏");
        porkcard.put(count++,"小🃏");

        for(String co:color){
            for(String nu:number){
              String card=co+nu;
              porkcard.put(count++,card);
            }
        }

        Set<Integer> set=porkcard.keySet();
        ArrayList<Integer> numlist=new ArrayList<>();
        numlist.addAll(set);

        Collections.shuffle(numlist);

        ArrayList<Integer> player1=new ArrayList<>();
        ArrayList<Integer> player2=new ArrayList<>();
        ArrayList<Integer> player3=new ArrayList<>();
        ArrayList<Integer> dipai=new ArrayList<>();

        for(Integer i:numlist){
            if(i>51){
                dipai.add(i);
            }else if(i%3==0){
                player1.add(i);
            }else if(i%3==1){
                player2.add(i);
            }else {
                player3.add(i);
            }
        }

        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(dipai);

        ArrayList<String> player11=new ArrayList<>();
        ArrayList<String> player22=new ArrayList<>();
        ArrayList<String> player33=new ArrayList<>();
        ArrayList<String> dipai_=new ArrayList<>();

        for(Integer i:player1){
            String card=porkcard.get(i);
            player11.add(card);
        }
        for(Integer i:player2){
            String card=porkcard.get(i);
            player22.add(card);
        }
        for(Integer i:player3){
            String card=porkcard.get(i);
            player33.add(card);
        }
        for(Integer i:dipai){
            String card=porkcard.get(i);
            dipai_.add(card);
        }
        System.out.println("p1"+player11);
        System.out.println("p2"+player22);
        System.out.println("p3"+player33);
        System.out.println("dp"+dipai_);

    }
}
