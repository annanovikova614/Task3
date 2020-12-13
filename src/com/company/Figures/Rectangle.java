package com.company.Figures;

import com.company.Point;

public class Rectangle {
    Point minPoint;
    Point maxPoint;

    public Rectangle(Point minPoint, Point maxPoint) {
        this.minPoint = minPoint;
        this.maxPoint = maxPoint;
    }

    public boolean isPointInside(Point point) {
        return ((point.getX() >= minPoint.getX()) && (point.getX() <= maxPoint.getX())
                && (point.getY() >= minPoint.getY()) && (point.getY() <= maxPoint.getY()));
    }
}
