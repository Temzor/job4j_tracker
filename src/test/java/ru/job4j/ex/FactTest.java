package ru.job4j.ex;

import org.junit.Test;
import static org.hamcrest.Matchers.is;

import static org.junit.Assert.assertThat;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void when0MinusFactorial() {
        int result = Fact.calc(-1);
    }

    @Test
    public void when0PlusFactorial() {
        int result = Fact.calc(4);
        assertThat(result, is(24));
    }
}