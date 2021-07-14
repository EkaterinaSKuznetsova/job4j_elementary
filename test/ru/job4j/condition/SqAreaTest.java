package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

   @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K1Square4() {
        int expected = 4;
        int p = 8;
        double k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP5K1Square1and56() {
        double expected = 1.56;
        int p = 5;
        double k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K4Square5and76() {
        double expected = 5.76;
        int p = 12;
        double k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP1K1Square0and0625() {
        double expected = 0.0625;
        int p = 1;
        double k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.0001);
    }
}