package Shapes;

// Concrete Subclass
class Circle extends Shape {
    double radius;

    // Constructor
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    // Implementation of abstract method to calculate area
    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementation of abstract method to calculate perimeter
    
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

