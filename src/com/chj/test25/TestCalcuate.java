package com.chj.test25;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalcuate {
    Calcuate calcuate;

    @Before
    public void init() {
        if (calcuate == null) {
            calcuate = new Calcuate();
        }
    }

    @After
    public void close() {
        calcuate = null;
    }

    @Test
    public void testAdd() {
        int result = calcuate.add(2, 3);
        Assert.assertEquals("加法有问题", 5, result);
    }

    @Test
    public void testSubtract() {
        int result = calcuate.subtract(12, 2);
        // 故意设置减法期望值为10000
        Assert.assertEquals("减法有问题", 10000, result);
    }

    @Test
    public void testMultiply() {
        int result = calcuate.multiply(2, 3);
        Assert.assertEquals("乘法有问题", 6, result);
    }

    @Test
    public void testDivide() {
        int result = calcuate.divide(6, 3);
        Assert.assertEquals("除法有问题", 2, result);
    }

}
