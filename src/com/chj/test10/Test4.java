package com.chj.test10;
interface Play{
    abstract void playGame();

}

class Oldphone{
    public void call(){
        System.out.println("旧手机的打电话");

    }

    public void sengMessage(){
        System.out.println("旧手机的发短信");
    }
}

class NewPhone extends Oldphone implements Play{
    @Override
    public void playGame() {
        System.out.println("新手机的玩游戏");
    }

    @Override
    public void call() {

        System.out.println("新手机的打电话");
    }

    @Override
    public void sengMessage() {

        System.out.println("新手机的打发短信");
    }
}

public class Test4 {
    public static void main(String[] args) {
           NewPhone np=new NewPhone();
           Oldphone op=new Oldphone();
           op.call();
           op.sengMessage();
           np.call();
           np.sengMessage();
           np.playGame();
    }

}
