// Java example that reads the marks of 5 students from the user and stores them in an array

import java.util.Scanner;

public class Ex02 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Declare an array to store marks of 5 students
        int[] studentMarks = new int[5];

        // Read and store marks for each student
        for (int i = 0; i < studentMarks.length; i++) 
        {
            System.out.print("Enter marks for Student " + (i + 1) + ": ");
            studentMarks[i] = scanner.nextInt();
        }

        // Close the scanner to prevent resource leak
        scanner.close();

        // Display the entered marks
        System.out.println("Entered marks for 5 students:");
        for (int i = 0; i < studentMarks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + studentMarks[i]);
        }
    }
}
