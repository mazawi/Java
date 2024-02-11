package EmployeeManagement;

class Employee {
    String name;
    int employeeId;
    double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void raiseSalary(double percentage) {
        salary += salary * (percentage / 100);
        System.out.println("Salary raised by " + percentage + "% for employee " + name);
    }

    public void displayInfo() {
        System.out.println("Employee: " + name + ", ID: " + employeeId + ", Salary: " + salary);
    }
}
