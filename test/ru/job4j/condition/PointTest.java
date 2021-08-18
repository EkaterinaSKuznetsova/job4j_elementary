package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to00then2() {
        double expected = 2;
        Point a = new Point(2, 0);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to20then3and16() {
        double expected = 3.16;
        Point a = new Point(1, 3);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when05to50then7and07() {
        double expected = 7.07;
        Point a = new Point(0, 5);
        Point b = new Point(5, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when58to00then9and43() {
        double expected = 9.43;
        Point a = new Point(5, 8);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}