package com.chj.test25;

import org.junit.Test;
@MyAnno1
public class Test10 {

    @Test
    public void t2(){
        @MyAnno2
        String p;

    }

     @Test
     @MyAnno3(type = "java",intArr = {1,2,3})
    public void t3(){

     }

}


