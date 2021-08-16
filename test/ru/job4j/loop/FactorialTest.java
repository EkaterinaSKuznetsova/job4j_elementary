package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int result = Factorial.calc(n);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int result = Factorial.calc(n);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForEightThen40320() {
        int n = 8;
        int result = Factorial.calc(n);
        int expected = 40320;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialFor12Then479001600() {
        int n = 12;
        int result = Factorial.calc(n);
        int expected = 479001600;
        Assert.assertEquals(expected, result);
    }
}