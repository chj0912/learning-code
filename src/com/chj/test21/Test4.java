package com.chj.test21;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        try (
                BufferedReader br = new BufferedReader(new FileReader("D:\\data.txt"))

        ) {
            System.out.println("请输入一个验证码");
            String str = sc.nextLine();
            String line = null;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }

               /* System.out.println(list.get(0));
                System.out.println(list.get(1));
                System.out.println(list.get(2));*/


            if(list.contains(str)){
                System.out.println("验证通过");
            }else {
                System.out.println("验证失败");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
