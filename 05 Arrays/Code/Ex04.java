import java.util.Scanner;

public class Ex04 
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
            // Ensure that the input is an integer

            studentMarks[i] = scanner.nextInt();
        }

        // Calculate the average of the entered marks
        double sum = 0;
        for (int i = 0; i < studentMarks.length; i++) 
        {
            sum += studentMarks[i];
        }
        double average = sum / studentMarks.length;

        // Close the scanner to prevent resource leak
        scanner.close();

        // Display the calculated average
        System.out.println("Average marks: " + average);
    }
}
