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

    @Test
    public void checkIfTwoLinesAreTheSame() throws Exception {
        Line line1 = new Line(new Point(6, 4), new Point(5, 6));
        Line line2 = new Line(new Point(6, 4), new Point(5, 6));
        assertEquals(true, line1.isSame(line2));
        line1 = new Line(new Point(6, 4), new Point(5, 6));
        line2 = new Line(new Point(5, 6), new Point(6, 4));
        assertEquals(true, line1.isSame(line2));
    }
}
