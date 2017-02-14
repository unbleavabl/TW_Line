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
}
