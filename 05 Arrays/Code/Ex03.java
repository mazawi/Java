// Java example that reads the marks of 5 students and finds the sum of the marks

import java.util.Scanner;

public class Ex03 
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

        // Calculate the total 
        int sum = 0;
        for (int i = 0; i < studentMarks.length; i++) 
        {
            sum+=studentMarks[i];
            
        }
        System.out.println("The total sum of the marks is: "+ sum);
    }
}
