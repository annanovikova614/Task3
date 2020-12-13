package com.company.Figures;

import com.company.Point;

public class HorizontalParabola {
    Point center;
    double q;
    String type;

    public HorizontalParabola(Point center, double q, String type) {
        this.center = center;
        this.q = q;
        this.type = type;
    }

    public boolean isPointInside(Point point) {
        if (type.equals("RightOfParabola")){
            return (point.getX() >= (q * (point.getY() - center.getY()) * (point.getY() - center.getY()) + center.getX()));
        }
        if (type.equals("LeftOfParabola")) {
            return (point.getX() <= (q * (point.getY() - center.getY()) * (point.getY() - center.getY()) + center.getX()));
        }
        return false;
    }
}