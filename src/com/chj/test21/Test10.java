package com.chj.test21;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test10 {
    public static void main(String[] args)throws IOException {
       BufferedReader br=new BufferedReader(new FileReader("D:\\test.txt"));
       BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\test1.txt"));
        List<String > list=new ArrayList<>();
        while (br.readLine()!=null){
            list.add(br.readLine());
        }

        Collections.reverse(list);

        for(String s:list){
            bw.write(s);
            bw.write("\r\n");
        }

        bw.close();
        br.close();


    }

}
