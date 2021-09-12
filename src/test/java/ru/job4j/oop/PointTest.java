package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Assert;

public class PointTest extends TestCase {

    public void testDistance() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double result = a.distance(b);
        double expected = 2.0;
        Assert.assertEquals(expected, result, 2);
    }

    public void testDistanceMore() {
        Point a = new Point(3, 7);
        Point b = new Point(8, 9);
        double result = a.distance(b);
        double expected = 5.39;
        Assert.assertEquals(expected, result, 2);
    }

    public void testDistanceEvenMore() {
        Point a = new Point(3, 7);
        Point b = new Point(11, 34);
        double result = a.distance(b);
        double expected = 28.16;
        Assert.assertEquals(expected, result, 2);
    }
}