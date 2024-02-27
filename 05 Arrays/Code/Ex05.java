import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        // Read and store values in the array
        for (int i = 0; i < numbers.length; i++) 
        {
            System.out.print("Enter element " + (i + 1) + ": ");
            
            numbers[i] = scanner.nextInt();
        }

        // Find the maximum number in the array
        int maxNumber = numbers[0]; // Assume the first element is the maximum initially

        for (int i = 1; i < numbers.length; i++) 
        {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        // Close the scanner to prevent resource leak
        scanner.close();
        
        // Display the maximum number
        System.out.println("Maximum number in the array: " + maxNumber);
    }
}
