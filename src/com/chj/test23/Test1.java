package com.chj.test23;

import javax.xml.crypto.Data;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) {

        showLongTime(()-> System.out.println(new Date().getTime()));

    }

    public static void showLongTime(CurrentTimePrinter timePrinter){
        timePrinter.printCurrentTime();
    }

}

@FunctionalInterface
interface CurrentTimePrinter{
    void printCurrentTime();
}
