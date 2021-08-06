package org.oop;

public class Point {
    private double x;
    private double y;

    public double getX()
    {
        return x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public static double distance(Point p)
    {
        double xDistance = this.getX() - p.getX();
        double yDistance = this.getY() - p.getY();
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }
    public static double direction(Point p)
    {
        double xDistance = this.getX() - p.getX();
        double yDistance = this.getY() - p.getY();
        return Math.atan2(yDistance, xDistance);
    }
}
