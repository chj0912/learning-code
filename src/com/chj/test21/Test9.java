package com.chj.test21;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        PrintStream ps=new PrintStream("b.txt");

        ps.println(str);
        /*System.setOut(ps);
        System.out.print(str);*/
        ps.close();

    }
}
