package com.chj.test05;

public class Test9 {
    public static void main(String[] args) {
        String [] hs={"黑桃","红桃","梅花","方块"};
        String [] ds={"A","J","Q","K","10","9","8","7","6","5","4","3","2","1"};

        for (int i=0;i<hs.length;i++){
              for(int j=0;j<ds.length;j++){
                  System.out.print(hs[i]+ds[j]+" ");
              }
            System.out.println(" ");
        }

    }

}
