package ru.training.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void nonDigitCharacters() {
        assertFalse(Solution.validatePin("a234"));
        assertFalse(Solution.validatePin(".234"));
    }

    @Test
    public void invalidLengths() {
        assertFalse(Solution.validatePin("1"));
        assertFalse(Solution.validatePin("12"));
        assertFalse(Solution.validatePin("123"));
        assertFalse(Solution.validatePin("12345"));
        assertFalse(Solution.validatePin("1234567"));
        assertFalse(Solution.validatePin("-1234"));
        assertFalse(Solution.validatePin("1.234"));
        assertFalse(Solution.validatePin("00000000"));
    }
}