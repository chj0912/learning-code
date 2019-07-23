package com.chj.test05;

public class Test10 {
    public static void main(String[] args) {
        int [] arr={99,100,98,97,96};
        int max=arr[0];
        int min=arr[0];
        int sum=0;
        int avg=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        avg=(sum-max-min)/arr.length;

        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
        System.out.println(avg);
    }
}
