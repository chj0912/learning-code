package com.chj.test05;

public class Test6 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        boolean isMirror = true;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != arr[arr.length -1-i]) {
                isMirror = false;
                break;
            }

       System.out.println("{1,2,3,4,3,2,1} 是否对称:"+isMirror);
    }
}




