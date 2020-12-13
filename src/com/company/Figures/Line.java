package com.company.Figures;

import com.company.Point;

public class Line {
    public double x0;
    public double y0;
    public double a;

    public Line(Point point, double a) {
        this.x0 = point.getX();
        this.y0 = point.getY();
        this.a = a;
    }

    public boolean isPointAboveLine(Point point) {
        return  point.getY() > a * ( point.getX() - x0) + y0;
    }
}
