package ru.job4j.converter;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert0RblThen0Euro() {
        float in = 0;
        float expected = 0;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert6000RblThen100Dlr() {
        float in = 6000;
        float expected = 100;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}