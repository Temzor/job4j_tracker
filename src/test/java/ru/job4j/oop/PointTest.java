package ru.job4j.oop;

import junit.framework.TestCase;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import ru.job4j.oop.Point;

import org.junit.Test;

public class PointTest {

    @Test
    public void testDistance1() {
        Point a = new Point(2, 4);
        Point b = new Point(6, 2);
        double result = a.distance(b);
        assertThat(result, closeTo(4.4, 0.1));
    }

    @Test
    public void testDistance2() {
        Point a = new Point(4, 9);
        Point b = new Point(3, 1);
        double result = a.distance(b);
        assertThat(result, closeTo(8, 0.1));
    }

    @Test
    public void testDistance3() {
        Point a = new Point(2, 4);
        Point b = new Point(6, 2);
        double result = a.distance(b);
        assertThat(result, closeTo(4.4, 0.1));
    }

    @Test
    public void testDistance3d() {
        Point a = new Point(2, 4, 8);
        Point b = new Point(6, 2, 1);
        double result = a.distance3d(b);
        assertThat(result, closeTo(8.3, 0.1));
    }
}