package CarObject;

// Car class definition
class Car {
    // Fields
    String brand;
    String model;
    int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car: " + year + " " + brand + " " + model);
    }
}

