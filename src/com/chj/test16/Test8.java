package com.chj.test16;

public class Test8 {
    public static void main(String[] args) {

    }
}

class Father  {
    public void eat() throws ToothPainExecption {
        System.out.println("吃到一个石头");
        throw new ToothPainExecption("吃到一个石头");
    }

    public void drink() {
        System.out.println("喝什么都没问题");
    }
}

class Son extends Father {
    //重写方法不能抛出与父类平级的异常 TonguePainExecption与ToothPainExecption平级
    /*public void eat()throws TonguePainExecption{
    }*/
    //重写方法不能抛出比父类高级的异常  PainExecption比ToothPainExecption高级
    /*public void eat() throws PainExecption{

    }*/
    //：重写方法可以抛出和父类同样的异常
    /*public void eat()throws ToothPainExecption{

    }*/
    //：重写方法可以抛出和子类的异常
    /*public void eat()throws BigToothPainExecption{

    }*/
    // 重写方法可以抛出多个 "父类抛出异常的子类异常".
    /*public void eat(){
        try {
            System.out.println("吃了一个石头");
        }catch (BigToothPainExecption e){
            System.out.println(e);
         //  throw new BigToothPainExecption("aaa");
        }catch (ToothPainExecption e1){
            System.out.println(e1);
          //  throw new FrontToothPainExecption("aaa");
        }
    }*/

    //父类不抛出异常,子类也不能抛出异常(编译时异常)
    /*public void drink()throws ToothPainExecption{

    }*/
    //：如果子类内部抛出了异常(或调用抛出异常的方法)只能自己处理,不允许向外抛
    /*public void drink() {
        System.out.println("喝了100°的水");
        throw new TonguePainExecption("舌头疼");*/

    }


    class PainExecption extends Exception {
        public PainExecption() {

        }

        public PainExecption(String message) {
            super(message);
        }
    }

    class ToothPainExecption extends PainExecption {
        public ToothPainExecption() {
        }

        public ToothPainExecption(String message) {
            super(message);
        }
    }

    class TonguePainExecption extends PainExecption {
        public TonguePainExecption() {
        }

        public TonguePainExecption(String message) {
            super(message);
        }
    }

    class BigToothPainExecption extends ToothPainExecption {
        public BigToothPainExecption() {
        }

        public BigToothPainExecption(String message) {
            super(message);
        }
    }

    class FrontToothPainExecption extends ToothPainExecption {
        public FrontToothPainExecption() {
        }

        public FrontToothPainExecption(String message) {
            super(message);
        }
    }
