package com.chj.test21;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test12 {
    public static void main(String[] args)throws IOException {
        Path path= Paths.get("a.txt");


        BufferedReader br=new BufferedReader(new FileReader(String.valueOf(path.toAbsolutePath())));
        BufferedWriter bw=new BufferedWriter(new FileWriter("b.txt"));
        String str=null;
        while ((str=br.readLine())!=null){
            bw.write(str);
            bw.newLine();
        }
        bw.close();
        br.close();

        BufferedReader brr=new BufferedReader(new FileReader("b.txt"));
        String str2=null;
        while ((str2=brr.readLine())!=null){

            System.out.println(str2);

        }

         brr.close();

    }
}
