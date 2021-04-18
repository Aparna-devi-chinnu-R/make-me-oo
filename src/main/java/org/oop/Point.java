package org.oop;

public class Point {
    private double x;
    private double y;

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public double distance(Point p)
    {
        double xDistance = this.getX() - p.getX();
        double yDistance = this.getY() - p.getY();
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }
    public double direction(Point p)
    {
        double xDistance = p.getX() - this.getX();
        double yDistance = p.getY() - this.getY();
        System.out.println(Math.atan2(yDistance, xDistance));
        return Math.atan2(yDistance, xDistance);
    }
}
