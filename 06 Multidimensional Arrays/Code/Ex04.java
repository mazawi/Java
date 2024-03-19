/*
 * Write a Java program to store the marks of 4 students in 5 subjects.
 * Then, increase the marks of all students by 2
 * 
 */

 import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] marks = new int[4][5];  // Array to store marks (4 students, 5 subjects)

        // Input marks for each student
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextInt();
            }
        }

        // Increase marks by 2
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j] += 2;
            }
        }

        // Display marks after increment
        System.out.println("\nMarks after increment: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
