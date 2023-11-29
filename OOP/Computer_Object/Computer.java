package Computer_Object;

class Computer {
    String brand;
    String processor;
    int ramSizeGB;
    int storageSizeGB;

    public Computer(String brand, String processor, int ramSizeGB, int storageSizeGB) {
        this.brand = brand;
        this.processor = processor;
        this.ramSizeGB = ramSizeGB;
        this.storageSizeGB = storageSizeGB;
    }

    public void displayInfo() {
        System.out.println("Computer - Brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ramSizeGB + " GB");
        System.out.println("Storage: " + storageSizeGB + " GB");
    }
}

