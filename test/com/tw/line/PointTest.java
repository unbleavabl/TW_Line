package com.tw.line;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void checkValuesPassedAreSetCorrectly() {
        Point point1 = new Point(5, 7);
        Point point2 = new Point(5, 7);
        assertEquals(point1, point2);
        Point point3 = new Point(9, 2);
        assertNotEquals(point1, point3);
    }

    @Test
    public void lengthShouldReturnLengthOfThePointToTheGivenPoint() {
        Point point1 = new Point(5, 0);
        Point point2 = new Point(8, 0);
        assertEquals(3, point1.lengthToPoint(point2), 0.001);
        point1 = new Point(5, 6);
        point2 = new Point(8, 10);
        assertEquals(5, point1.lengthToPoint(point2), 0.001);
    }
}
