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
}
