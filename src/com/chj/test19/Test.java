package com.chj.test19;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pathname = sc.nextLine();
        File file = new File(pathname);
        System.out.println(file.getName());
        printF(file, 0);
    }

    public static void printF(File file, int level) {
        File[] files = file.listFiles();
        String perPAUSE = "  ";
        for (int i = 0; i < level; i++) {
            perPAUSE += "  ";
        }

        for (int i=0;i<files.length;i++) {
            System.out.println(perPAUSE+files[i].getName());
            if (files[i].isDirectory()) {
               printF(files[i],level+1);
            }

        }


    }
}
