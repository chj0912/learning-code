package com.chj.test25;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test2 {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        String str="str123";
        //获得list的所有方法
        Method[] methods=list.getClass().getMethods();
        System.out.println(methods.length);

        for(int i=0;i<methods.length;i++){
            System.out.println(methods[i]);
        }

        try {
            //通过反射来执行list的第一个方法，第一个是list对象，代表该对象的方法，第二个是方法参数：list.add(str);
            methods[0].invoke(list,str);
            System.out.println(list.size());
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }


}
