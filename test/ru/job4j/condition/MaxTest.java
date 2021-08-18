package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        Max maxTwo = new Max();
        int result = maxTwo.max(1, 2);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To2Then5() {
        Max maxTwo = new Max();
        int result = maxTwo.max(5, 2);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        Max maxTwo = new Max();
        int result = maxTwo.max(2, 2);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxFromThirdNumbers() {
        Max maxTwo = new Max();
        int result = maxTwo.max(2, 3, 6);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxFromFourthNumbers() {
        Max maxTwo = new Max();
        int result = maxTwo.max(9, 2, 0, 1);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }
}