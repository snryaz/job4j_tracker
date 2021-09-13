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

    public void testDistance3d() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 0, 0);
        double result = a.distance3d(b);
        double expected = 2.0;
        Assert.assertEquals(expected, result, 2);
    }

    public void testDistance3dMore() {
        Point a = new Point(0, 4, 0);
        Point b = new Point(2, 0, 7);
        double result = a.distance3d(b);
        double expected = 8.3;
        Assert.assertEquals(expected, result, 0.01);
    }

    public void testDistance3dEvenMore() {
        Point a = new Point(3, 10, 15);
        Point b = new Point(2, 5, 7);
        double result = a.distance3d(b);
        double expected = 9.4868;
        Assert.assertEquals(expected, result, 0.0001);
    }
}