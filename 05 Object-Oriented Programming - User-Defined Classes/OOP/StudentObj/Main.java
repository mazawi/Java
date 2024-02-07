package StudentObj;

public class Main {
    public static void main(String[] args) {
        // Creating instances (objects) of the Student class
        Student student1 = new Student("John Doe", 20, 3.8);
        Student student2 = new Student("Jane Smith", 22, 3.2);

        // Calling methods on the objects
        student1.displayInfo();
        System.out.println("Honor Roll Status: " + student1.isHonorRoll());

        student2.displayInfo();
        System.out.println("Honor Roll Status: " + student2.isHonorRoll());
    }
}

