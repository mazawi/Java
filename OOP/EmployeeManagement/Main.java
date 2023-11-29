package EmployeeManagement;

public class Main 
{
    public static void main(String[] args) 
    {
        Employee employee1 = new Employee("Ali", 101, 500);
        Employee employee2 = new Employee("Aisha", 102, 600);

        employee1.raiseSalary(10);
        employee1.displayInfo();

        employee2.raiseSalary(8);
        employee2.displayInfo();
    }
}
