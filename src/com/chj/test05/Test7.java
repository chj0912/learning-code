package com.chj.test05;

public class Test7 {
    public static void main(String[] args) {
        int []arr1={1,2,3,4,5,6,7};
        int []arr2={1,2,3,4,5,6,7};

        System.out.println("两个数组是否一致:"+equals(arr1,arr2));

    }
    public static boolean equals(int []arr1,int []arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        for (int i=0;i<arr1.length;i++){
            if (arr1[i]!=arr2[i]){
                return false;
            }
        }

        return true;
    }
}
