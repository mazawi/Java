package Shapes;

// Abstract Superclass (Base Class)
abstract class Shape 
{
    String name;
    
    public Shape(String name) 
    {
        this.name = name;
    }

    // Abstract methods to be implemented by subclasses
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    // Method to get the name of the shape
    public String getName() 
    {
        return name;
    }

    // Method to display information about the shape
    public void displayInfo() 
    {
        System.out.println("Shape: " + name);
    }
}


