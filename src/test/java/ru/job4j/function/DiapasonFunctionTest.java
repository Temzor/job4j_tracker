package ru.job4j.function;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DiapasonFunctionTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = DiapasonFunction.diapason(3, 7, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(7D, 9D, 11D, 13D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenQuad() {
        List<Double> result = DiapasonFunction.diapason(3, 7, x -> 2 * Math.pow(x, 2) + 3 * x + 7);
        List<Double> expected = Arrays.asList(32D, 51D, 86D, 153D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenExpo() {
        List<Double> result = DiapasonFunction.diapason(3, 7, x -> Math.pow(8, x));
        List<Double> expected = Arrays.asList(512D, 4096D, 32768D, 262144D);
        assertThat(result, is(expected));
    }
}