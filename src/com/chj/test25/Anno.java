package com.chj.test25;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Anno {
}

@Target(ElementType.TYPE)
@interface MyAnno1{

}

@Retention(RetentionPolicy.SOURCE)
@interface MyAnno2{
    String type() default "java";
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
@interface MyAnno3{
    String type();
    int [] intArr();
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Book{
    String value(); //书名
    double price() default 100;//价格
    String [] authors();//多位作者
}