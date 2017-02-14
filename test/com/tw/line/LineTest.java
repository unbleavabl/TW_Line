package com.tw.line;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LineTest {
    @Test(expected = IllegalArgumentException.class)
    public void pointsShouldNotBeSameInALine() throws Exception {
        Line line = new Line(new Point(5, 7), new Point(5, 7));
    }

    @Test
    public void lengthShouldReturnLengthOfTheLine() throws Exception {
        Line line = new Line(new Point(0, 2), new Point(0, 6));
        assertEquals(4, line.length(), 0.0001);
        line = new Line(new Point(2, 4), new Point(5, 8));
        assertEquals(5, line.length(), 0.0001);
    }
}
