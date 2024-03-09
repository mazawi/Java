package Shapes;

// Concrete Subclass
class Rectangle extends Shape {
    double length;
    double width;

    // Constructor
    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    // Implementation of abstract method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Implementation of abstract method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
