package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To2Then3() {
        int first = 3;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To2To8Then8() {
        int first = 3;
        int second = 2;
        int third = 8;
        int result = Max.max(first, second, third);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To8To10Then6() {
        int first = 8;
        int second = 10;
        int third = 6;
        int result = Max.max(first, second, third);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax20To8To10To20Then6() {
        int first = 8;
        int second = 10;
        int third = 20;
        int fourth = 6;
        int result = Max.max(first, second, third, fourth);
        int expected = 20;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax50To4To30To10Then50() {
        int first = 4;
        int second = 30;
        int third = 10;
        int fourth = 50;
        int result = Max.max(first, second, third, fourth);
        int expected = 50;
        Assert.assertEquals(result, expected);
    }
}

