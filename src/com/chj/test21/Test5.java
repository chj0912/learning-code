package com.chj.test21;

import java.io.*;

public class Test5 {
    public static void main(String[] args)throws IOException {
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("a.txt"),"gbk");
        String str="我爱Java";
        osw.write(str);
        osw.close();
    }

}
