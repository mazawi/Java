package PointCircle;

public class Circle extends Point
{
    double r;

    public Circle(int x, int y) 
    {
        super(x, y);
    }
    public Circle()
    {
        super();
    }

    public Circle(int x, int y, double r1) 
    {
        super(x, y);
        this.r = r1;
    
    }

    public double findCircumference()
    {
        return 2* Math.PI * r;
    }

    public double findArea()
    {
        return Math.PI * r*r;
    }

    public String toString()
    {
        String st = super.toString() + ", "+ r;
        return st;
    }

    
}
