package ru.job4j.oop;

import junit.framework.TestCase;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class TriangleTest extends TestCase {

    public void testArea() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }

    public void testAreaImpossible() {
        Point a = new Point(3, 7);
        Point b = new Point(11, 34);
        Point c = new Point(11, 34);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(-1, 0));
    }
}