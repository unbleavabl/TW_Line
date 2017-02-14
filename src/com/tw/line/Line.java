package com.tw.line;

//represents a geometric shape made by connecting two points
public class Line {
    private Point point1, point2;

    public Line(Point point1, Point point2) throws Exception {
        if (point1.equals(point2)) {
            throw (new IllegalArgumentException());
        }
        this.point1 = point1;
        this.point2 = point2;
    }
}
