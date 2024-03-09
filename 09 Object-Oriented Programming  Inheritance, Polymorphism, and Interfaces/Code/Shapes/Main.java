package Shapes;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Rectangle class
        Rectangle rectangle = new Rectangle("MyRectangle", 5.0, 8.0);

        // Display information about the rectangle
        rectangle.displayInfo();

        // Calculate and display the area of the rectangle
        double area = rectangle.calculateArea();
        System.out.println("Area: " + area);

        // Calculate and display the perimeter of the rectangle
        double perimeter = rectangle.calculatePerimeter();
        System.out.println("Perimeter: " + perimeter);
    }
}
