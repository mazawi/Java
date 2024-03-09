package PointCircle;

public class Point 
{
    private int x;
    private int y;
    protected int z;
    public String colour;

    // Constructor
    public Point(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }

    public Point() 
    {
        this.x = 0;
        this.y = 0;
    }


    // Method
    public void display() 
    {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }

    public String toString()
    {
        return x + ", " + y;
    }
}
