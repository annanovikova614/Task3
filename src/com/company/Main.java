package com.company;

import com.company.Figures.HorizontalParabola;
import com.company.Figures.Line;
import com.company.Figures.Rectangle;

public class Main {
    static Line line = new Line(new Point(5,-4),2.5);
    static HorizontalParabola hp1 = new HorizontalParabola(new Point(6,1),0.5, "RightOfParabola");
    static HorizontalParabola hp2 = new HorizontalParabola(new Point(-6,1),0.5, "LeftOfParabola");
    static Rectangle rectangle = new Rectangle(new Point(2,-5),new Point(4,4));

    public static void main(String[] args) {
        tests();
    }

    public static SimpleColor printColorForPoint(double x, double y) {
        Point point = new Point(x,y);

        if (hp2.isPointInside(point)) {
            return SimpleColor.BLUE;
        }
        if (rectangle.isPointInside(point)) {
            return SimpleColor.BLUE;
        }
        if (line.isPointAboveLine(point) && hp1.isPointInside(point)) {
            return SimpleColor.WHITE;
        }
        if (!line.isPointAboveLine(point) && hp1.isPointInside(point)) {
            return SimpleColor.ORANGE;
        }
        if (!line.isPointAboveLine(point) && !hp1.isPointInside(point)) {
            return SimpleColor.WHITE;
        }
        else return SimpleColor.GRAY;
    }

    public static void tests() {
        System.out.println(printColorForPoint(3,3));
        System.out.println(printColorForPoint(0,0));
        System.out.println(printColorForPoint(7,2));
        System.out.println(printColorForPoint(9,2));
        System.out.println(printColorForPoint(8,3));
        System.out.println(printColorForPoint(8,2.9));
        System.out.println(printColorForPoint(8,3.1));
    }
}
