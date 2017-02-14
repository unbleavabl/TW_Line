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

    public double length() {
        return point1.lengthToPoint(point2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        if (!point1.equals(line.point1)) {
            if (!point1.equals(line.point2)) {
                return false;
            }
            return point2.equals(line.point1);
        }
        return point2.equals(line.point2);
    }

    @Override
    public int hashCode() {
        int result = point1.hashCode();
        result = 31 * result + point2.hashCode();
        return result;
    }

    public boolean isSame(Line line) {
        if (this.equals(line)) {
            return true;
        }
        return false;
    }
}
