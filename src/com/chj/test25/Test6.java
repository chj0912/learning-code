package com.chj.test25;

import java.lang.reflect.Field;

public class Test6 {
    public static void main(String[] args)throws Exception {

         Class c=B.class;
         B b=(B)c.newInstance();

         setProperty(b,"name","我在测试");
         System.out.println(getProperty(b,"name"));

    }



    //写一个方法，此方法可将obj对象中名为propertyName的属性的值设置为value.
    public static void setProperty(Object obj, String propertyName, Object value)throws Exception{
        Class c=obj.getClass();
        Field field=c.getDeclaredField(propertyName);
        field.setAccessible(true);
        field.set(obj,value);
    }


    //写一个方法，此方法可以获取obj对象中名为propertyName的属性的值
    public static Object getProperty(Object obj, String propertyName) throws Exception{
           Class c=obj.getClass();
           Field field=c.getDeclaredField(propertyName);
           field.setAccessible(true);
           return field.get(obj);
    }

}


class B{
    private String name;
}