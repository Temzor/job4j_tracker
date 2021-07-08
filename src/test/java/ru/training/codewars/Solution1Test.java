package ru.training.codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Solution1Test {
    @Test
    public void testNormalCondition() {
        assertEquals(9, Solution1.solveSuperMarketQueue(new int[] {2, 2, 3, 3, 4, 4 }, 2));
    }

    @Test
    public void testEmptyArray() {
        assertEquals(0, Solution1.solveSuperMarketQueue(new int[] {}, 1));
    }

    @Test
    public void testSingleTillManyCustomers() {
        assertEquals(15, Solution1.solveSuperMarketQueue(new int[] {1, 2, 3, 4, 5 }, 1));
    }

}