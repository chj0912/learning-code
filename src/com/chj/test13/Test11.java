package com.chj.test13;

public class Test11 {

    public static void main(String[] args) {
        String [] str={"4","5","7","6","2"};
        Integer [] i={1,2,3,4,5,6,4,7,5};
        swap(str,1,3);
     //   swap(i,2,4);



    }
    public static <E> void swap(E arr[],int index1,int index2){
        E temp;
        temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

        for(E e1:arr){
            System.out.println(e1);
        }
    }

}
