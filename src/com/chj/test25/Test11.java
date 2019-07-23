package com.chj.test25;


import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;


public class Test11 {
    @Test
    public void show() throws Exception {
        Class<TestAnno> c = TestAnno.class;
        Method method = c.getMethod("showBook");
        Book b = method.getAnnotation(Book.class);
        String name = b.value();
        double price = b.price();
        String[] authors = b.authors();



        System.out.println(name);
        System.out.println(price);
        System.out.println(Arrays.toString(authors));
    }


}

class TestAnno {

    @Book(value = "聊斋", price = 1000, authors = {"蔡洪杰", "蔡"})
    public void showBook() {
        System.out.println("这本书真好看");
    }

}