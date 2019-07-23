package com.chj.test06;

class Card{
    private String hs;
    private String ds;

    public Card(String hs, String ds) {
        this.hs=hs;
        this.ds=ds;
    }

    public String getHs() {
        return hs;
    }

    public String getDs() {
        return ds;
    }

    public void setHs(String hs) {
        this.hs = hs;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    public void showCard(){
        System.out.println(hs+ds);
    }
}


public class Test4 {
    public static void main(String[] args) {
        Card card=new Card("黑桃","A");
        card.showCard();
    }

}
