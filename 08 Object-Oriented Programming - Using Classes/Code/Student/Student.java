package Student;

// Student class definition
class Student {
    // Fields
    String name;
    int age;
    double gpa;

    // Constructor
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student: " + name + ", Age: " + age + ", GPA: " + gpa);
    }

    // Method to check if the student is eligible for an honor roll
    public boolean isHonorRoll() {
        return gpa >= 3.5;
    }
}

