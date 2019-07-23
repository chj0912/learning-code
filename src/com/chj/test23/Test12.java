package com.chj.test23;

import java.util.function.Consumer;

public class Test12 {
    public static void main(String[] args) {
            String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男" };
            print(  s -> System.out.print("姓名:"+s.split(",")[0]+","),
                    s -> System.out.println(("性别:")+s.split(",")[1]+"。"),
                    array);


    }

    private static void print( Consumer<String> consumer1,Consumer<String > consumer2,String[] arr){
             for(String info:arr){
                 consumer1.andThen(consumer2).accept(info);
             }
    }

}
